package package_2;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class LocalHost_DELETE {
	
	@Test
	public void test_DELETE01() {
		
		baseURI = "http://localhost:3000/";
		
		given().
			delete("/users/5").
		then().
			statusCode(200);
			
			
			
	}

}
