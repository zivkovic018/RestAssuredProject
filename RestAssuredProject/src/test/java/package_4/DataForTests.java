package package_4;

import org.testng.annotations.DataProvider;

public class DataForTests {
	
	@DataProvider (name = "DataForPost")    
	public Object[] [] dataForPost02(){
		
		return new Object[] [] {				
			{"Dunja", "Krstic", 1},
			{"Vujadin", "Krstic", 2}
		};
		
	}
	
	@DataProvider (name = "DataForDelete")
	public Object[] dataForDelete () {
		
		return new Object[] {
				7,8				
		};
		
	}

}
