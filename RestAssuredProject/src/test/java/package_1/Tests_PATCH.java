package package_1;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class Tests_PATCH {
	
	@Test
	public void test_01() {
		
		
		JSONObject request = new JSONObject();
		
		request.put("name", "Katarina");
		request.put("job", "Teacher");
		
		given().
			header("Content-type", "application/json").
			contentType(ContentType.JSON).
			accept(ContentType.JSON).
			body(request.toJSONString()).
		when().
			patch("https://reqres.in/api/users/2").
		then().
			statusCode(200).
			log().all();
			
	}

}
