package annotationstests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class EnabledParameter {
	
	/*
	 * you can disable the test by passing parameter enabled = "false" in testng.xml file or test method file
	 */

	public WebDriver driver = null;
	
	@BeforeMethod
	public void setUp() {
		System.out.println("before method");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
	}
	
	@AfterMethod
	public void tearDown() {
		System.out.println("after method");
		driver.quit();
	}
	
	@Test(priority=1)
	public void userLoginWithValidCredentials() {
		System.out.println("test1");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("amotooricap1@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("12345");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		String actual = driver.findElement(By.linkText("Edit your account information")).getText();
		Assert.assertEquals(actual,"Edit your account information");
		
	}
	
	@Test(priority=2)
	public void userLoginWithValidEmailInvalidPassword() {
		System.out.println("test2");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("amotooricap1@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("123459900");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		String actual = driver.findElement(By.xpath("//div[contains(@class,'alert-dismissible')]")).getText();
		Assert.assertEquals(actual,"Warning: No match for E-Mail Address and/or Password.");
		
	}
	
	@Test(priority=3)
	public void userLoginWithInvalidEmailValidPassword() {
		System.out.println("test3");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("1h@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("12345");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		String actual = driver.findElement(By.xpath("//div[contains(@class,'alert-dismissible')]")).getText();
		Assert.assertEquals(actual,"Warning: No match for E-Mail Address and/or Password.");
		
	}
	
	@Test(priority=4)
	public void userLoginWithInvalidCreds() {
		System.out.println("test4");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("1h@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("12345808");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		String actual = driver.findElement(By.xpath("//div[contains(@class,'alert-dismissible')]")).getText();
		Assert.assertEquals(actual,"Warning: No match for E-Mail Address and/or Password.");
		
	}
	
	@Test(priority=5)
	public void userLoginWithEmptyCreds() {
		System.out.println("test5");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("");
		driver.findElement(By.id("input-password")).sendKeys("");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		String actual = driver.findElement(By.xpath("//div[contains(@class,'alert-dismissible')]")).getText();
		Assert.assertEquals(actual,"Warning: No match for E-Mail Address and/or Password.");
		
	}
}
