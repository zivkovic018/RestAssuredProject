package package_1;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;


import static io.restassured.RestAssured.*;

public class Tests_PUT {

	@Test
	public void test_01() {
		
		JSONObject request = new JSONObject();
		
		request.put("name", "morpheus");
		request.put("job", "zion resident");
		
		given().
			header("Content-type", "application/json").
			contentType(ContentType.JSON).
			accept(ContentType.JSON).
			body(request.toJSONString()).
		when().
			put("https://reqres.in/api/users/2").
		then().
			statusCode(200).
			log().all();
			
		
	}
	
}
