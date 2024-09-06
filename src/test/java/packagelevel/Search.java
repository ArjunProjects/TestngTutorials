package packagelevel;

import org.testng.annotations.Test;

public class Search {
	
	@Test
	public void searchForValidProduct() {
		
		System.out.println("searchForValidProduct - Search");
	}
	
	@Test
	public void searchForInValidProduct() {
		
		System.out.println("searchForInValidProduct - Search");
	}
	
	@Test
	public void searchWithoutSearchItem() {
		
		System.out.println("searchWithoutSearchItem - Search");
	}

}
