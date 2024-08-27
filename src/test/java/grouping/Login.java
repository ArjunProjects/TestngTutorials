package grouping;

import org.testng.annotations.Test;

public class Login {
	
	@Test(priority=1)
	public void userLoginWithValidCreds() {
		System.out.println("userLoginWithValidCreds - Login");
	}
	

	@Test(priority=2)
	public void userLoginWithValidEmailInvalidPassword() {
		System.out.println("userLoginWithValidEmailInvalidPassword - Login");
	}
	
	@Test(priority=3)
	public void userLoginWithInvalidEmailValidPassword() {
		System.out.println("userLoginWithInvalidEmailValidPassword - Login");
	}
	
	@Test(priority=4)
	public void userLoginWithInvalidCreds() {
		System.out.println("userLoginWithInvalidCreds - Login");
	}
	
	@Test(priority=5)
	public void userLoginWithEmptyCreds() {
		System.out.println("userLoginWithEmptyCreds - Login");
	}
	
	

}
