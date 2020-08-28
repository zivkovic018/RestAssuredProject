package package_2;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class LocalHost_PUT {
	
	
	@Test
	public void test_PUT01() {
		
		JSONObject request = new JSONObject();
		
		request.put("firstName","Petar");
		request.put("lastName", "Petrovic");
		request.put("subjectId", 2);
		
		
		baseURI = "http://localhost:3000/";
		
		given().
			header("Content-type", "aplication/json").
			contentType(ContentType.JSON).
			accept(ContentType.JSON).
			body(request.toJSONString()).
		when().
			put("/users/4").
		then().
			statusCode(200).
			log().all();
	}

}
