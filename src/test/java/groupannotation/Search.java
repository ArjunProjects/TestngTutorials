package groupannotation;

import org.testng.annotations.Test;

public class Search {
	
	
	@Test(priority=1,groups= {"smoke","sanity","regression","Search","all"})
	public void searchForValidProduct() {
		System.out.println("searchForValidProduct - Search");
		
	}
	
	@Test(priority=2,groups= {"sanity","regression","Search","all"})
	public void searchForInalidProduct() {
		System.out.println("searchForInalidProduct - Search");
		
	}
	
	@Test(priority=3,groups= {"sanity","regression","Search","all"})
	public void searchWithoutSearchItem() {
		System.out.println("searchWithoutSearchItem - Search");
		
	}

}

