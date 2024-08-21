package annotationstests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginWithOptionalParameters {
	
	/*
	 * if no parameter passed from xml and we declare optional parameter in tet method then test should execute
	 * xml parameter takes the first priority over optional parameters
	 * if url parameter is declared in xml and optional parameter is also declared in the script, in this case xml param will take the priority and optional one will be ignored
	 */
	
	public WebDriver driver = null;
	
	@BeforeMethod
	public void browserSetup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@AfterMethod
	public void quitBrowser() {
		driver.quit();
	}
	
	@Parameters({"url","email","password"})
	@Test
	public void verifyLoginWithValidCredentials(@Optional("https://tutorialsninja.com/demo/index.php?route=account/login")String appUrl, String userEmail, String userPassword) {
		driver.get(appUrl);
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys(userEmail);
		driver.findElement(By.id("input-password")).sendKeys(userPassword);
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		WebElement isLink = driver.findElement(By.linkText("Edit your account information"));
		Assert.assertTrue(isLink.isDisplayed());

}

}
