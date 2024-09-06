package ddt;

import org.testng.annotations.DataProvider;

public class SampleProviderThree {
	
	
	@DataProvider(name="data3")
	public String[][] provideDataTwo() {
		
		String[][] data = {
				{"Telengana","Hyderabad","Biryani"},
				{"Andhrapradesh","Amaravathi","Uggani"}
		};
		return data;
	}

}
