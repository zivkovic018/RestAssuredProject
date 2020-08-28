package package_2;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class LocalHost_PATCH {
	
	@Test
	public void test_PATCH01() {
		
		JSONObject request = new JSONObject();
		
		request.put("lastName", "Spasic");
		
		
		baseURI = "http://localhost:3000/";
		
		given().
			header("Content-type", "aplication/json").
			contentType(ContentType.JSON).
			accept(ContentType.JSON).
			body(request.toJSONString()).
		when().
			patch("/users/4").
		then().
			statusCode(200).
			log().all();
	}

}
