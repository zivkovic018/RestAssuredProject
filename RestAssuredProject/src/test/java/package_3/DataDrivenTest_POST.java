package package_3;

import org.json.simple.JSONObject;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class DataDrivenTest_POST {
	
//	@DataProvider (name = "DataForPost")    
//	public Object[] [] dataForPost01(){
//		
//		Object[] [] data = new Object[2] [3];   		
//		
//		
//		data[0] [0] = "Milica";
//		data[0] [1] = "Krstic";
//		data[0] [2] = 2;
//		
//		data[1] [0] = "Milos";
//		data[1] [1] = "Krstic";  					
//		data[1] [2] = 1;
//		
//		return data;
//		
//		
//	}
	
	@DataProvider (name = "DataForPost")    
	public Object[] [] dataForPost02(){
		
		return new Object[] [] {				
			{"Dunja", "Krstic", 1},
			{"Vujadin", "Krstic", 2}
		};
		
	}
	
	
	@Test (dataProvider = "DataForPost")
	public void test_POST01(String firstName, String lastName, int subjectId) {
		
		JSONObject request = new JSONObject();
		
		request.put("firstName", firstName);
		request.put("lastName", lastName);
		request.put("subjectId", subjectId);
		
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
