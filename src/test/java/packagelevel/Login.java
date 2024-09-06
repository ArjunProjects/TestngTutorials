package packagelevel;

import org.testng.annotations.Test;

public class Login {
	
	
	@Test
	public void loginWithValidCreds() {
		System.out.println("loginWithValidCreds - Login");
	}
	
	@Test
	public void loginWithInvalidCreds() {
		System.out.println("loginWithInvalidCreds - Login");
	}
	
	@Test
	public void loginWithInvalidEmailInvalidPassword() {
		System.out.println("loginWithInvalidEmailInvalidPassword - Login");
	}
	
	@Test
	public void loginWithvalidEmailInvalidPassword() {
		System.out.println("loginWithvalidEmailInvalidPassword - Login");
	}
	
	@Test
	public void loginWithEmptyCreds() {
		System.out.println("loginWithEmptyCreds - Login");
	}
	

}
