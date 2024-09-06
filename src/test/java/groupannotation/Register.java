package groupannotation;


import org.testng.annotations.Test;

public class Register {

	@Test(priority=1,groups= {"smoke","sanity","regression","Register","all"})
	public void resisterByProvidingMandatoryFields() {
		System.out.println("resisterByProvidingMandatoryFields - Register");
	}
	

	@Test(priority=2,groups= {"smoke","sanity","regression","Register","all"})
	public void resisterByProvidingAllFields() {
		System.out.println("resisterByProvidingAllFields - Register");
	}
	
	@Test(priority=3,groups= {"Register","all"})
	public void resisterByNotProvidingAnyFields() {
		System.out.println("resisterByNotProvidingAnyFields - Register");
	}
	
	@Test(priority=4,groups= {"sanity","Register","all"})
	public void resisterByProvidingDuplicateEmail() {
		System.out.println("resisterByProvidingDuplicateEmail - Register");
	}
	
}

