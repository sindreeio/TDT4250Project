package polet.util;

import java.net.URI;
import java.io.*;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import static polet.util.Constants.API_KEY;

public class DataGenerator {
	
	public static void main(String[] args) {
		DataGenerator dg = new DataGenerator();
		dg.downloadJson();
	}
	
	
	private void downloadJson() {
        try
        {	
        	HttpClient httpclient = HttpClients.createDefault();
        	
        	
        	// Max 1048575
            URIBuilder builder = new URIBuilder("https://apis.vinmonopolet.no/products/v0/details-normal");
            builder.setParameter("maxResults", "1048575");
            URI uri = builder.build();
            
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
                    file.flush();
         
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
				product.addProperty("volume", obj.get("basic").getAsJsonObject().get("volume").getAsString());
				
				x.add("product", product);
				

				country.addProperty("countryId", obj.get("origins").getAsJsonObject().get("origin").getAsJsonObject().get("countryId").getAsString());
				country.addProperty("name", obj.get("origins").getAsJsonObject().get("origin").getAsJsonObject().get("country").getAsString());
				
				region.addProperty("regienId", obj.get("origins").getAsJsonObject().get("origin").getAsJsonObject().get("regionId").getAsString());
				region.addProperty("name", obj.get("origins").getAsJsonObject().get("origin").getAsJsonObject().get("region").getAsString());
				
				country.add("region", region);
				x.add("country", country);
				
				productType.addProperty("productTypeId", obj.get("classification").getAsJsonObject().get("subProductTypeId").getAsString());
				productType.addProperty("productTypeName", obj.get("classification").getAsJsonObject().get("subProductTypeName").getAsString());
				
				x.add("productType", productType);
				
				x.addProperty("kronePerVolume", obj.get("prices").getAsJsonArray().get(0).getAsJsonObject().get("salesPricePrLiter").getAsFloat());
				x.addProperty("kronePerAlcohol", pricePerAlcohol);
				
				editedData.add(x);
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		// Prints out number of elements in the database
		System.out.println(editedData.size());
		return editedData;	
	}

}
