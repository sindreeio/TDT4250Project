package polet.util;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import polet.Categories;
import polet.Country;
import polet.MealType;
import polet.PoletFactory;
import polet.PoletPackage;
import polet.Product;
import polet.ProductOfTypeInMealType;
import polet.ProductOfTypeInRegion;
import polet.ProductType;
import polet.Region;

import static polet.util.Constants.API_KEY;


// A class for generating data from our chosen API
public class DataGenerator {
	
	public static void main(String[] args) {
		DataGenerator dg = new DataGenerator();
		//dg.downloadJson(); // If you uncomment this line, the generator will download the data from the server.
		dg.saveAsXMI(500); // This runs a function that will read a JSON file and create an XMI file.
	}
	
	// This method will download the json file.
	private void downloadJson() {
        try
        {	
        	HttpClient httpclient = HttpClients.createDefault();
        	
        	// The next lines creates a HTTP request to the API server
            URIBuilder builder = new URIBuilder("https://apis.vinmonopolet.no/products/v0/details-normal");
            builder.setParameter("maxResults", "1048575"); // 1048575 is the maximum number we can pull, last checked 05.11.2020.
            java.net.URI uri = builder.build();
            
            HttpGet request = new HttpGet(uri);
            request.setHeader("Ocp-Apim-Subscription-Key", API_KEY);
            
            System.out.println("Downloading the database from the API.");
            HttpResponse response = httpclient.execute(request);
            HttpEntity entity = response.getEntity();
            System.out.println("Success!");
            System.out.println("-------------------------");
            
            // Using a Json library to print a more readable Json structure
            Gson gson = new GsonBuilder().setPrettyPrinting().create();

            if (entity != null) 
            {   
            	System.out.println("Converting to string");
            	
            	// Creates a Json element from the string that is recieved from the server
                JsonElement element = gson.fromJson(EntityUtils.toString(entity), JsonElement.class);
                System.out.println("Filtering out unnecessary information and creates a json object.");
                
                // Here we call a function to structure the response from the http request.
                // Otherwise we would have a lot of information that are not relevant for this program.
                JsonArray editedData = editedData(element.getAsJsonArray());
                String jsonString = gson.toJson(editedData);
                
                // Write a JSON file
            	// Saves file in ./model folder as data.json
                try (FileWriter file = new FileWriter("./model/data.json")) {
                    file.write(jsonString);
                    file.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
	}
	
	// This is the function that will structure, filter and edit the data
	// for our needs.
	private JsonArray editedData(JsonArray jArray) {
		
		// This uses the GSON library for processing Json data.
		JsonArray editedData = new JsonArray();
		
		for (JsonElement element : jArray) {
			try {
				JsonObject obj = element.getAsJsonObject();
				if (obj.get("basic").getAsJsonObject().get("volume").getAsFloat() <= 0.0) {
					continue;
				}
					
				float salePrice = obj.get("prices").getAsJsonArray().get(0).getAsJsonObject().get("salesPrice").getAsFloat();
				float alcoholContent = obj.get("basic").getAsJsonObject().get("alcoholContent").getAsFloat();
				float volume = obj.get("basic").getAsJsonObject().get("volume").getAsFloat();
				float alcoholVolume = (float) (volume * (alcoholContent / 100));
				float pricePerAlcohol = (float) Math.round((salePrice / alcoholVolume));
				
				JsonObject x = new JsonObject();
				JsonObject product = new JsonObject();
				JsonObject country = new JsonObject();
				JsonObject region = new JsonObject();
				JsonObject productType = new JsonObject();
				JsonArray mealtypes = new JsonArray();
				
				product.addProperty("productId", obj.get("basic").getAsJsonObject().get("productId").getAsString());
				product.addProperty("name", obj.get("basic").getAsJsonObject().get("productShortName").getAsString());
				product.addProperty("price", salePrice);
				product.addProperty("alcoholContent", alcoholContent);
				product.addProperty("volume", volume);
				product.addProperty("pricePerAlcohol", pricePerAlcohol);
				product.addProperty("pricePerVolume",(float) Math.round(obj.get("prices").getAsJsonArray().get(0).getAsJsonObject().get("salesPricePrLiter").getAsFloat()));
				
				x.add("product", product);
				
				region.addProperty("regionId", obj.get("origins").getAsJsonObject().get("origin").getAsJsonObject().get("regionId").getAsString());
				region.addProperty("name", obj.get("origins").getAsJsonObject().get("origin").getAsJsonObject().get("region").getAsString());

				country.addProperty("countryId", obj.get("origins").getAsJsonObject().get("origin").getAsJsonObject().get("countryId").getAsString());
				country.addProperty("name", obj.get("origins").getAsJsonObject().get("origin").getAsJsonObject().get("country").getAsString());
				
				country.add("region", region);
				x.add("country", country);
				
				productType.addProperty("productTypeId", obj.get("classification").getAsJsonObject().get("subProductTypeId").getAsString());
				productType.addProperty("name", obj.get("classification").getAsJsonObject().get("subProductTypeName").getAsString());
				
				x.add("productType", productType);
				
				for (JsonElement m : obj.get("description").getAsJsonObject().get("recommendedFood").getAsJsonArray()) {
					String desc = m.getAsJsonObject().get("foodDesc").getAsString();
					mealtypes.add(desc);
				}
				
				x.add("mealTypes", mealtypes);
				
				editedData.add(x);
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("Number of objects in the json file: " + editedData.size());
		System.out.println("-------------------------");
		
		return editedData;	
	}
	
	// The purpose of this method is to create an instance
	// of our root object and objects from the data in the Json file.
	// Limit <= 0 is the same as infinite.
	private EObject jsonToXMI(int limit) {
		Gson gson = new Gson();
		JsonArray productArray;
		
		// Here we use an instance of the fatory for the model
		// to create an instance of our root object, Categories.
		Categories categories = PoletFactory.eINSTANCE.createCategories();
		
		// These hash maps are used for checking if an object
		// is already made, and connect new object to those that already exist.
		HashMap<String, Country> countries = new HashMap<String, Country>();
		HashMap<String, Region> regions = new HashMap<String, Region>();
		HashMap<String, ProductType> productTypes = new HashMap<String, ProductType>();
		HashMap<String, MealType> mealtypes = new HashMap<String, MealType>();
		HashMap<String, ProductOfTypeInRegion> ptrs = new HashMap<String, ProductOfTypeInRegion>();
		HashMap<String, ProductOfTypeInMealType> ptmts = new HashMap<String, ProductOfTypeInMealType>();
		
		try {
		   int counter = 0;
		  
		   System.out.println("Reading JSON from file..");
		   System.out.println("-------------------------");
		   
		   // Reads the stored Json file
		   BufferedReader br = new BufferedReader(
		     new FileReader("./model/data.json"));
		   
		   // Converts the Json string back to an object
		   productArray = gson.fromJson(br, JsonArray.class);
		   
		   // The loop will iterate through every valid product in the Json file,
		   // create instances and relations after the model structure.
		   for (JsonElement element : productArray) {
			   Product product = PoletFactory.eINSTANCE.createProduct();
			   
			   // Product information
			   product.setProductId(element.getAsJsonObject().get("product").getAsJsonObject().get("productId").getAsString());
			   product.setName(element.getAsJsonObject().get("product").getAsJsonObject().get("name").getAsString());
			   product.setPrice(element.getAsJsonObject().get("product").getAsJsonObject().get("price").getAsFloat());
			   product.setAlcoholContent(element.getAsJsonObject().get("product").getAsJsonObject().get("alcoholContent").getAsFloat());
			   product.setVolume(element.getAsJsonObject().get("product").getAsJsonObject().get("volume").getAsFloat());
			   product.setPricePerAlcohol(element.getAsJsonObject().get("product").getAsJsonObject().get("pricePerAlcohol").getAsFloat());
			   product.setPricePerVolume(element.getAsJsonObject().get("product").getAsJsonObject().get("pricePerVolume").getAsFloat());
			   
			   // Country
			   Country country;
			   
			   if (!countries.containsKey(element.getAsJsonObject().get("country").getAsJsonObject().get("countryId").getAsString())) {
				   country = PoletFactory.eINSTANCE.createCountry();
				   country.setCountryId(element.getAsJsonObject().get("country").getAsJsonObject().get("countryId").getAsString());
				   country.setName(element.getAsJsonObject().get("country").getAsJsonObject().get("name").getAsString());
				   countries.put(country.getCountryId(), country);
				   categories.getCountries().add(country);
			   } else {
				   country = countries.get(element.getAsJsonObject().get("country").getAsJsonObject().get("countryId").getAsString());
			   }
			   
			   
			   // Region
			   Region region;
			   // This one is a little more complicated.
			   // Since some products haves the region name "Øvrige" or an empty string, which would be a region in every country.
			   // We decided to register these products region name with the same country name to distinguish them. 
			   if (((!regions.containsKey(country.getCountryId() + element.getAsJsonObject().get("country").getAsJsonObject().get("region").getAsJsonObject().get("regionId").getAsString())) && (!element.getAsJsonObject().get("country").getAsJsonObject().get("region").getAsJsonObject().get("regionId").getAsString().equals("00") && !element.getAsJsonObject().get("country").getAsJsonObject().get("region").getAsJsonObject().get("regionId").getAsString().equals(""))) || ((element.getAsJsonObject().get("country").getAsJsonObject().get("region").getAsJsonObject().get("regionId").getAsString().equals("00") || element.getAsJsonObject().get("country").getAsJsonObject().get("region").getAsJsonObject().get("regionId").getAsString().equals("")) && (!regions.containsKey(element.getAsJsonObject().get("country").getAsJsonObject().get("countryId").getAsString() + "1")))) {
				   region = PoletFactory.eINSTANCE.createRegion();
				   if (element.getAsJsonObject().get("country").getAsJsonObject().get("region").getAsJsonObject().get("regionId").getAsString().equals("00") || element.getAsJsonObject().get("country").getAsJsonObject().get("region").getAsJsonObject().get("regionId").getAsString().equals("")) {
					   region.setRegionId(element.getAsJsonObject().get("country").getAsJsonObject().get("countryId").getAsString() + "1");
					   region.setName(element.getAsJsonObject().get("country").getAsJsonObject().get("name").getAsString());
				   } else {
					   region.setRegionId(country.getCountryId() + element.getAsJsonObject().get("country").getAsJsonObject().get("region").getAsJsonObject().get("regionId").getAsString());
					   region.setName(element.getAsJsonObject().get("country").getAsJsonObject().get("region").getAsJsonObject().get("name").getAsString());
				   }
				   region.setCountry(country);
				   regions.put(region.getRegionId(), region);
			   } else {
				   if (element.getAsJsonObject().get("country").getAsJsonObject().get("region").getAsJsonObject().get("regionId").getAsString().equals("00") || element.getAsJsonObject().get("country").getAsJsonObject().get("region").getAsJsonObject().get("regionId").getAsString().equals("")) {
					   region = regions.get(element.getAsJsonObject().get("country").getAsJsonObject().get("countryId").getAsString() + "1");
				   } else {
					   region = regions.get(country.getCountryId() + element.getAsJsonObject().get("country").getAsJsonObject().get("region").getAsJsonObject().get("regionId").getAsString());
				   }
			   }
			   
			   // Product type
			   ProductType pt;
			   
			   if (!productTypes.containsKey(element.getAsJsonObject().get("productType").getAsJsonObject().get("productTypeId").getAsString())) {
				   pt = PoletFactory.eINSTANCE.createProductType();
				   pt.setProductTypeId(element.getAsJsonObject().get("productType").getAsJsonObject().get("productTypeId").getAsString());
				   pt.setName(element.getAsJsonObject().get("productType").getAsJsonObject().get("name").getAsString());
				   productTypes.put(pt.getProductTypeId(), pt);
				   categories.getProductTypes().add(pt);
			   } else {
				   pt = productTypes.get(element.getAsJsonObject().get("productType").getAsJsonObject().get("productTypeId").getAsString());
			   }
			   product.setProductType(pt);
			   
			   // Product of a type in region
			   ProductOfTypeInRegion ptr;
			   
			   if (ptrs.containsKey(region.getRegionId() + pt.getProductTypeId())) {
				   ptr = ptrs.get(region.getRegionId() + pt.getProductTypeId());
			   } else {
				   ptr = PoletFactory.eINSTANCE.createProductOfTypeInRegion();
				   ptr.setRegion(region);
				   ptr.setProductType(pt);
				   ptrs.put(region.getRegionId() + pt.getProductTypeId(), ptr);
			   }
			   ptr.getProducts().add(product);
			   
			   // A product can be suitable for multiple meal types
			   List<MealType> mts = new ArrayList<>();
			   
			   for (JsonElement m : element.getAsJsonObject().get("mealTypes").getAsJsonArray()) {
				   MealType mt;
				   if (mealtypes.containsKey(m.getAsString())) {
					   mt = mealtypes.get(m.getAsString());
				   } else {
					   mt = PoletFactory.eINSTANCE.createMealType();
					   mt.setName(m.getAsString());
					   mealtypes.put(mt.getName(), mt);
					   categories.getMealTypes().add(mt);
				   }
				   mts.add(mt);
			   }
			   
			   for (MealType m : mts) {
				   // Product of a type in meal type
				   ProductOfTypeInMealType ptmt;
				   if (ptmts.containsKey(pt.getProductTypeId() + m.getName()) ) {
					   ptmt = ptmts.get(pt.getProductTypeId() + m.getName());
				   } else {
					   ptmt = PoletFactory.eINSTANCE.createProductOfTypeInMealType();
					   ptmt.setMealType(m);
					   ptmt.setProductType(pt);
					   ptmts.put(pt.getProductTypeId() + m.getName(), ptmt);
				   }
				   ptmt.getProducts().add(product);
			   }
			   
			   // The counter, to end the loop after a certain amount
			   // of products are made.
			   counter += 1;
			   if (limit == counter) {
				   break;
			   }
		   }
		   
		   
		} catch (IOException e) {
			e.printStackTrace();
		}
		return categories;
	}

	// This function stores a file as an XMI type
	private void saveAsXMI(int limit) {
		// This uses the package information for our model
		ResourceSet resSet = new ResourceSetImpl();
		resSet.getPackageRegistry().put(PoletPackage.eNS_URI, PoletPackage.eINSTANCE);
		resSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		// The XMI resource will be created in the ./model folder as "categories.xmi"
		Resource resource = resSet.createResource(URI.createFileURI("./model/categories.xmi"));
		
		// Reads the Json file an creates an EObject
		resource.getContents().add(jsonToXMI(limit));
		try {
			System.out.println("Generating the XMI file...");
			resource.save(Collections.EMPTY_MAP);
			System.out.println("Success!");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
