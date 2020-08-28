package package_2;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class LocalHost_POST {
	
	
	@Test
	public void test_POST01() {
		
		JSONObject request = new JSONObject();
		
		request.put("firstName", "Marko");
		request.put("lastName", "Markovic");
		request.put("subjectId", 1);		
		
		baseURI = "http://localhost:3000/";
		
		given().
			header("Content-type", "aplication/json").
			contentType(ContentType.JSON).
			accept(ContentType.JSON).
			body(request.toJSONString()).
		when().
			post("/users").
		then().
			statusCode(201).
			log().all();
			
			
		
	}

}
