package grouping;

import org.testng.annotations.Test;

public class Register {

	@Test(priority=1)
	public void resisterByProvidingMandatoryFields() {
		System.out.println("resisterByProvidingMandatoryFields - Register");
	}
	

	@Test(priority=2)
	public void resisterByProvidingAllFields() {
		System.out.println("resisterByProvidingAllFields - Register");
	}
	
	@Test(priority=3)
	public void resisterByNotProvidingAnyFields() {
		System.out.println("resisterByNotProvidingAnyFields - Register");
	}
	
	@Test(priority=4)
	public void resisterByProvidingDuplicateEmail() {
		System.out.println("resisterByProvidingDuplicateEmail - Register");
	}
	
}
