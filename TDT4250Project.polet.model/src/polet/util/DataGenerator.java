package polet.util;

import java.io.*;
import java.util.Collections;
import java.util.HashMap;

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
import polet.KronePerAlcohol;
import polet.KronePerVolume;
import polet.PoletFactory;
import polet.PoletPackage;
import polet.Product;
import polet.ProductType;
import polet.Region;

import static polet.util.Constants.API_KEY;

public class DataGenerator {
	
	public static void main(String[] args) {
		DataGenerator dg = new DataGenerator();
		//dg.downloadJson();
		dg.saveXMI();
	}
	
	
	private void downloadJson() {
        try
        {	
        	HttpClient httpclient = HttpClients.createDefault();
        	
        	
        	// Max 1048575
            URIBuilder builder = new URIBuilder("https://apis.vinmonopolet.no/products/v0/details-normal");
            builder.setParameter("maxResults", "1048575");
            java.net.URI uri = builder.build();
            
            HttpGet request = new HttpGet(uri);
            request.setHeader("Ocp-Apim-Subscription-Key", API_KEY);

            HttpResponse response = httpclient.execute(request);
            HttpEntity entity = response.getEntity();
            
            Gson gson = new GsonBuilder().setPrettyPrinting().create();

            if (entity != null) 
            {   
                JsonElement element = gson.fromJson(EntityUtils.toString(entity), JsonElement.class);
                JsonArray editedData = editedData(element.getAsJsonArray());
                String jsonString = gson.toJson(editedData);
                // Write JSON file
            	// Saves file in model folder
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
	
	private JsonArray editedData(JsonArray jArray) {
		
		JsonArray editedData = new JsonArray();
		
		int counter = 0;
		int limit = 10;
		
		for (JsonElement element : jArray) {
			try {
				JsonObject obj = element.getAsJsonObject();
				if (obj.get("basic").getAsJsonObject().get("volume").getAsFloat() <= 0.0) {
					continue;
				}
				
				float salePrice = obj.get("prices").getAsJsonArray().get(0).getAsJsonObject().get("salesPrice").getAsFloat();
				float alcoholContent = obj.get("basic").getAsJsonObject().get("alcoholContent").getAsFloat();
				float pricePerAlcohol = (float) Math.round((salePrice / alcoholContent) * 100) / 100;
				
				JsonObject x = new JsonObject();
				JsonObject product = new JsonObject();
				JsonObject country = new JsonObject();
				JsonObject region = new JsonObject();
				JsonObject productType = new JsonObject();
				
				product.addProperty("productId", obj.get("basic").getAsJsonObject().get("productId").getAsString());
				product.addProperty("name", obj.get("basic").getAsJsonObject().get("productShortName").getAsString());
				product.addProperty("price", salePrice);
				product.addProperty("alcoholContent", alcoholContent);
				product.addProperty("volume", obj.get("basic").getAsJsonObject().get("volume").getAsFloat());
				
				x.add("product", product);
				
				region.addProperty("regionId", obj.get("origins").getAsJsonObject().get("origin").getAsJsonObject().get("regionId").getAsString());
				region.addProperty("name", obj.get("origins").getAsJsonObject().get("origin").getAsJsonObject().get("region").getAsString());

				country.addProperty("countryId", obj.get("origins").getAsJsonObject().get("origin").getAsJsonObject().get("countryId").getAsString());
				country.addProperty("name", obj.get("origins").getAsJsonObject().get("origin").getAsJsonObject().get("country").getAsString());
				
				country.add("region", region);
				x.add("country", country);
				
				productType.addProperty("productTypeId", obj.get("classification").getAsJsonObject().get("subProductTypeId").getAsString());
				productType.addProperty("productTypeName", obj.get("classification").getAsJsonObject().get("subProductTypeName").getAsString());
				
				x.add("productType", productType);
				
				x.addProperty("kronePerVolume", obj.get("prices").getAsJsonArray().get(0).getAsJsonObject().get("salesPricePrLiter").getAsFloat());
				x.addProperty("kronePerAlcohol", pricePerAlcohol);
				
				editedData.add(x);
				
				counter += 1;
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			if (counter == limit) {
				break;
			}
			
		}
		// Prints out number of elements in the database
		System.out.println(editedData.size());
		return editedData;	
	}
	
	private EObject jsonToXMI() {
		Gson gson = new Gson();
		JsonArray productArray;
		Categories categories = PoletFactory.eINSTANCE.createCategories();
		
		HashMap<String, Country> countries = new HashMap<String, Country>();
		HashMap<String, Region> regions = new HashMap<String, Region>();
		HashMap<String, ProductType> productTypes = new HashMap<String, ProductType>();
		HashMap<Float, KronePerAlcohol> kronePerAlcohols = new HashMap<Float, KronePerAlcohol>();
		HashMap<Float, KronePerVolume> kronePerVolumes = new HashMap<Float, KronePerVolume>();
		
		try {
		  
		   System.out.println("Reading JSON from a file");
		   System.out.println("----------------------------");
		   
		   BufferedReader br = new BufferedReader(
		     new FileReader("./model/data.json"));
		   
		    //convert the json string back to object
		   productArray = gson.fromJson(br, JsonArray.class);
		   
		   for (JsonElement element : productArray) {
			   Product product = PoletFactory.eINSTANCE.createProduct();
			   categories.getProducts().add(product);
			   
			   product.setProductId(element.getAsJsonObject().get("product").getAsJsonObject().get("productId").getAsString());
			   product.setName(element.getAsJsonObject().get("product").getAsJsonObject().get("name").getAsString());
			   product.setPrice(element.getAsJsonObject().get("product").getAsJsonObject().get("price").getAsFloat());
			   product.setAlcoholContent(element.getAsJsonObject().get("product").getAsJsonObject().get("alcoholContent").getAsFloat());
			   product.setVolume(element.getAsJsonObject().get("product").getAsJsonObject().get("volume").getAsFloat());
			   
			   
			   KronePerAlcohol kpa;
			   
			   if (!kronePerAlcohols.containsKey(element.getAsJsonObject().get("kronePerAlcohol").getAsFloat())) {
				   kpa = PoletFactory.eINSTANCE.createKronePerAlcohol();
				   kpa.setDerivedNumber(element.getAsJsonObject().get("kronePerAlcohol").getAsFloat());
				   kronePerAlcohols.put(kpa.getDerivedNumber(), kpa);
				   categories.getAlcoholPerKrones().add(kpa);
			   } else {
				   kpa = kronePerAlcohols.get(element.getAsJsonObject().get("kronePerAlcohol").getAsFloat());
			   }
			   product.setAlcoholPerKrone(kpa);
			   
			   
			   KronePerVolume kpv;
			   
			   if (!kronePerVolumes.containsKey(element.getAsJsonObject().get("kronePerVolume").getAsFloat())) {
				   kpv = PoletFactory.eINSTANCE.createKronePerVolume();
				   kpv.setDerivedNumber(element.getAsJsonObject().get("kronePerVolume").getAsFloat());
				   kronePerVolumes.put(kpv.getDerivedNumber(), kpv);
				   categories.getKronePerVolumes().add(kpv);
			   } else {
				   kpv = kronePerVolumes.get(element.getAsJsonObject().get("kronePerVolume").getAsFloat());
			   }
			   product.setKronePerVolume(kpv);
			   
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
			   
			   Region region;
			   
			   if (((!regions.containsKey(element.getAsJsonObject().get("country").getAsJsonObject().get("region").getAsJsonObject().get("regionId").getAsString())) && !element.getAsJsonObject().get("country").getAsJsonObject().get("region").getAsJsonObject().get("regionId").getAsString().equals("00")) || (element.getAsJsonObject().get("country").getAsJsonObject().get("region").getAsJsonObject().get("regionId").getAsString().equals("00") && (!regions.containsKey(element.getAsJsonObject().get("country").getAsJsonObject().get("countryId").getAsString() + "1")))) {
				   region = PoletFactory.eINSTANCE.createRegion();
				   if (element.getAsJsonObject().get("country").getAsJsonObject().get("region").getAsJsonObject().get("regionId").getAsString().equals("00")) {
					   region.setRegionId(element.getAsJsonObject().get("country").getAsJsonObject().get("countryId").getAsString() + "1");
					   region.setName(element.getAsJsonObject().get("country").getAsJsonObject().get("name").getAsString());
				   } else {
					   region.setRegionId(element.getAsJsonObject().get("country").getAsJsonObject().get("region").getAsJsonObject().get("regionId").getAsString());
					   region.setName(element.getAsJsonObject().get("country").getAsJsonObject().get("region").getAsJsonObject().get("name").getAsString());
				   }
				   region.setCountry(country);
				   regions.put(region.getRegionId(), region);
			   } else {
				   if (element.getAsJsonObject().get("country").getAsJsonObject().get("region").getAsJsonObject().get("regionId").getAsString().equals("00") ) {
					   region = regions.get(element.getAsJsonObject().get("country").getAsJsonObject().get("countryId").getAsString() + "1");
				   } else {
					   region = regions.get(element.getAsJsonObject().get("country").getAsJsonObject().get("region").getAsJsonObject().get("regionId").getAsString());
				   }
				   
			   }
			   
			   product.setRegion(region);
			   
			   ProductType pt;
			   if (!productTypes.containsKey(element.getAsJsonObject().get("productType").getAsJsonObject().get("productTypeId").getAsString())) {
				   pt = PoletFactory.eINSTANCE.createProductType();
				   pt.setProductTypeId(element.getAsJsonObject().get("productType").getAsJsonObject().get("productTypeId").getAsString());
				   pt.setName(element.getAsJsonObject().get("productType").getAsJsonObject().get("productTypeName").getAsString());
				   productTypes.put(pt.getProductTypeId(), pt);
				   categories.getProductTypes().add(pt);
			   } else {
				   pt = productTypes.get(element.getAsJsonObject().get("productType").getAsJsonObject().get("productTypeId").getAsString());
			   }
			   
			   if (!region.getProduces().contains(pt)) {
				   region.getProduces().add(pt);
			   }
			   
			   product.setProductType(pt);
			   
			   //System.out.println(categories.getProducts().toString());
		   }
		   
		   
		} catch (IOException e) {
			e.printStackTrace();
		}
		return categories;
	}

	private void saveXMI() {
		ResourceSet resSet = new ResourceSetImpl();
		resSet.getPackageRegistry().put(PoletPackage.eNS_URI, PoletPackage.eINSTANCE);
		resSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		Resource resource = resSet.createResource(URI.createFileURI("./model/categories.xmi"));
		
		
		
		resource.getContents().add(jsonToXMI());
		try {
			resource.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
