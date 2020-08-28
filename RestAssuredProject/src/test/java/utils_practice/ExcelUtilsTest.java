package utils_practice;

import static io.restassured.RestAssured.*;
import org.json.simple.JSONObject;
import io.restassured.http.ContentType;

public class ExcelUtilsTest {
	
	public static void main(String[] args) {
		
		String excelPath = "./data/TestData.xlsx";
		String sheetName = "Users1";
		
		ExcelUtils excel = new ExcelUtils(excelPath, sheetName);
		
		
		for (int i = 1; i < excel.getRowCount(); i++) {
			
			
			JSONObject request = new JSONObject();
			
			request.put("firstName", excel.getCellData(i, 0));
			request.put("lastName", excel.getCellData(i, 1));
			request.put("subjectId", excel.getCellData(i, 2));		
			
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

}
