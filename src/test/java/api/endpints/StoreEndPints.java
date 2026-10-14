package api.endpints;

import static io.restassured.RestAssured.given;

import api.payload.User;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class StoreEndPints {

	
	public static Response getPetStoreInventory()
	{
		
	 Response response = given()
		.contentType(ContentType.JSON)
		.when()
		.get(Routes.get_store_inventory_url);
		
		return response;
	}
	
	public static Response  placeOrder(User payload)
	{
	 Response response = given()
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.body(payload)
		.when()
		.post(Routes.post_url);
		
		return response;
	}
}
