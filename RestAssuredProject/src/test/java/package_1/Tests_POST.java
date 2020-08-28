package package_1;

import java.util.HashMap;  
import java.util.Map;      

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class Tests_POST {
	
	
	
	@Test
	public void test_1 () {
		
		Map <String, Object> map = new HashMap<String, Object>();
		
		map.put("name", "Aleksa");
		map.put("job", "QA");
		
		System.out.println(map);
		
		JSONObject request = new JSONObject (map);
		
		
		System.out.println(request); 
		
		System.out.println(request.toJSONString());  
		
	}
	
	@Test
	public void test_02 () {
		
		JSONObject request = new JSONObject();		
		
		request.put("name", "Katarina");
		request.put("job", "Teacher");
		
		System.out.println(request);
		
		given().
			header("Content-type", "application/json").
			contentType(ContentType.JSON).
			accept(ContentType.JSON).
			body(request.toJSONString()).
		when().
			post("https://reqres.in/api/users").
		then().
			statusCode(201).
			log().all();
			
	}
	
	
}
