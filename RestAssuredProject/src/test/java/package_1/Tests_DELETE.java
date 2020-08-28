package package_1;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class Tests_DELETE {
	
	@Test
	public void test_01() {
		
		
		given().
			delete("https://reqres.in/api/users/2").
		then().
			statusCode(204).
			log().all();
			
	}

}
