package ddt;

import org.testng.annotations.Test;

public class SampleDemoDataProvider {
	
	
	@Test(dataProvider="data",dataProviderClass=SampleProviderTwo.class)
	public void printData(String[] str) {
		
		System.out.println(str[0]+" "+str[1]+ " "+str[2]);
		
		}

}
