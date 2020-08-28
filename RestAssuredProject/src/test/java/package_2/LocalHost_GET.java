package package_2;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class LocalHost_GET {

	
	@Test
	public void test_GET01() {
		
		
		baseURI = "http://localhost:3000/";
		
		given().
			get("/users").
		then().
			statusCode(200).
			log().all();
			
		
	}
	
	
	@Test
	public void test_GET02() {
		
		
		baseURI = "http://localhost:3000/";
		
		given().
			param("name", "Automation").
			get("/subjects").
		then().
			statusCode(200).
			log().all();
			
		
	}
	
	
	
}
