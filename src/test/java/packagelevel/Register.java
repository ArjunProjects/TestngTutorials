package packagelevel;

import org.testng.annotations.Test;

public class Register {
	
	@Test
	public void registerWithAllFields() {
		System.out.println("registerWithAllFields - Register");
	}
	
	@Test
	public void registerWithAllMandatoryFields() {
		System.out.println("registerWithAllMandatoryFields - Register");
	}
	
	@Test
	public void registerWithDuplicateEmail() {
		System.out.println("registerWithDuplicateEmail - Register");
	}
	
	@Test
	public void registerWithoutProvidingAnyFields() {
		System.out.println("registerWithoutProvidingAnyFields - Register");
	}
	

}
