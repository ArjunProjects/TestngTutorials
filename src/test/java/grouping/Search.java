package grouping;

import org.testng.annotations.Test;

public class Search {
	
	
	@Test(priority=1)
	public void searchForValidProduct() {
		System.out.println("searchForValidProduct - Search");
		
	}
	
	@Test(priority=2)
	public void searchForInalidProduct() {
		System.out.println("searchForInalidProduct - Search");
		
	}
	
	@Test(priority=3)
	public void searchWithoutSearchItem() {
		System.out.println("searchWithoutSearchItem - Search");
		
	}

}
