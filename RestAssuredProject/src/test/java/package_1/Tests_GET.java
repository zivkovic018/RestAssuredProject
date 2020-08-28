package package_1;

import org.testng.annotations.Test;   // za @Test

import io.restassured.RestAssured;

import static io.restassured.RestAssured.*; // da bi mogli da koristimo given(). samo
import static org.hamcrest.Matchers.*;  //za body("data.id[1]", equalTo(8))

public class Tests_GET {

	@Test
	public void test_1 () {
		
		
		given().
			get("https://reqres.in/api/users?page=2").
		then().
			statusCode(200).
			body("data.id[1]", equalTo(8)).
			body("data.first_name", hasItems("Michael", "Lindsay")).
			log().all();
	}
	
	@Test
	public void test_2 () {
		
		RestAssured.get("https://reqres.in/api/users?page=2").
			then().
				statusCode(200).
				body("data.first_name", hasItems("Michael"));
				
	}
	
	
	
}
