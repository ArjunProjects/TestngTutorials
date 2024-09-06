package ddt;

import org.testng.annotations.DataProvider;

public class SampleProvider {
	
	@DataProvider
	public String[][] supplyData() {
		
		String[][] data = {
				{"amotooricap1@gmail.com","12345"},
				{"amotooricap3@gmail.com","12345"},
				{"amotooricap4@gmail.com","12345"}
		};
		return data;
		
	}

}
