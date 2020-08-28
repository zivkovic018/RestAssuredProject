package package_4;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class DataDrivenTest_DELETE extends DataForTests{
	
	
	@Test (dataProvider = "DataForDelete")			
	public void test_DELETE01(int userId) {
		
		baseURI = "http://localhost:3000/";
		
		given().
			delete("/users/" +userId).
		then().
			statusCode(200);
		
	}

}
