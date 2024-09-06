package ddt;

import org.testng.annotations.DataProvider;

public class SampleProviderTwo {
	
	
	@DataProvider(name = "data2")
	public String[][] provideData() {
		
		
		String[][] data = {
				{"ram","sake","pen"},
				{"kane","meka","pencil"},
				{"vishal","akula","eraser"}
		};
		
		return data;
	}
	
	@DataProvider(name="data")
	public String[][] provideDataOne() {
		
		String[][] data = {
				{"Apple","Summer","Healthy"}
		};
		return data;
	}

}
