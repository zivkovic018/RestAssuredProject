package package_3;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class DataDrivenTest_DELETE {
	
	
	@DataProvider (name = "DataForDelete")
	public Object[] dataForDelete () {
		
		return new Object[] {
				7,8,9,10,11,12			
		};
	}
	
	@Test (dataProvider = "DataForDelete")			
	public void test_DELETE01(int userId) {
		
		baseURI = "http://localhost:3000/";
		
		given().
			delete("/users/" +userId).
		then().
			statusCode(200);
		
	}
}
