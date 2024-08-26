package annotationstests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;


/*
 * none of the test method will be executed whatever available inside that class if you have Ignore annotation at class level
 */

@Ignore
public class IgnoreAnnotationClassLevel {
	
	@Test(priority=1)
	public void userLoginWithValidCredentials() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
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
	public void getAppTitle() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		System.out.println("test2");
		
		String expectedTitle = "Your Store";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle,expectedTitle,"title matched");
		
	}
	
	@Test(priority=3)
	public void getAppUrl() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		System.out.println("test3");
		
		String expectedUrl = "https://tutorialsninja.com/demo";
		String actualUrl = driver.getCurrentUrl();
		Assert.assertEquals(actualUrl,expectedUrl,"url matched");
		
	}

}
