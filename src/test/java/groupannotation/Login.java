package groupannotation;

import org.testng.annotations.Test;

public class Login {
	
	@Test(priority=1,groups= {"smoke","sanity","regression","Login","all"})
	public void userLoginWithValidCreds() {
		System.out.println("userLoginWithValidCreds - Login");
	}
	

	@Test(priority=2,groups= {"sanity","regression","Login","all"})
	public void userLoginWithValidEmailInvalidPassword() {
		System.out.println("userLoginWithValidEmailInvalidPassword - Login");
	}
	
	@Test(priority=3,groups= {"sanity","regression","Login","all"})
	public void userLoginWithInvalidEmailValidPassword() {
		System.out.println("userLoginWithInvalidEmailValidPassword - Login");
	}
	
	@Test(priority=4,groups= {"smoke","sanity","regression","Login","all"})
	public void userLoginWithInvalidCreds() {
		System.out.println("userLoginWithInvalidCreds - Login");
	}
	
	@Test(priority=5,groups= {"sanity","regression","Login","all"})
	public void userLoginWithEmptyCreds() {
		System.out.println("userLoginWithEmptyCreds - Login");
	}
	
	

}
