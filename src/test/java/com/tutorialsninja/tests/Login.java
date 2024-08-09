package com.tutorialsninja.tests;

import java.util.Date;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Login {
	WebDriver driver = null;
	
	
	@BeforeTest
	public void launchBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@Test
	public void verifyLoginWithValidCredentials() {
		driver.get("https://tutorialsninja.com/demo/");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("amotooricap1@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("12345");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		WebElement isLink = driver.findElement(By.linkText("Edit your account information"));
		Assert.assertTrue(isLink.isDisplayed());
	}
	
	@Test
	public void verifyLoginWithInalidCredentials() {
		driver.get("https://tutorialsninja.com/demo/");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys(generateTimeStamp());
		driver.findElement(By.id("input-password")).sendKeys("1234567890");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		WebElement alertText = driver.findElement(By.xpath("//div[contains(@class,'alert')]"));
		Assert.assertTrue(alertText.getText().contains("Warning: No match for E-Mail Address and/or Password."));
	}
	
	
	@AfterTest
	public void quitBrowser() {
		driver.quit();
	}
	
	public int generateRandomNums() {
		Random r = new Random();
		return r.nextInt();
	}
	
	public String generateTimeStamp() {
		Date d = new Date();
		return d.toString().replace(":", " ").replace("_", " ")+"@gmail.com";
	}

}
