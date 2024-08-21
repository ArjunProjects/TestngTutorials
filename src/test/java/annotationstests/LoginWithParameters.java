package annotationstests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginWithParameters {
	public WebDriver driver;
	
	@Parameters({"url","email","password"})
	@Test
	public void verifyLoginWithValidCredentials(String appUrl, String userEmail, String userPassword) {
		driver.get(appUrl);
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys(userEmail);
		driver.findElement(By.id("input-password")).sendKeys(userPassword);
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		WebElement isLink = driver.findElement(By.linkText("Edit your account information"));
		Assert.assertTrue(isLink.isDisplayed());

}
	@BeforeMethod
	public void setupBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}
}
