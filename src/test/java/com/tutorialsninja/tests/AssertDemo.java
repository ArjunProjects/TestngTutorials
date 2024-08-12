package com.tutorialsninja.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import base.Base;

public class AssertDemo extends Base {
	
	@Test(enabled=false)
	public void sampleMethod() {
		launchBrowser();
		driver.manage().window().maximize();
		launchApp();
		
		String actualTitle = driver.getTitle();
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("return document.title");
		String expectedTitle = "Your Store";
		Assert.assertEquals(actualTitle, expectedTitle);
		quitBrowser();
	}
	
	@Test()
	public void sampleMethod2() {
		launchBrowser();
		driver.manage().window().maximize();
		launchApp();
		driver.findElement(By.xpath("//input[@name='search']")).sendKeys("HP",Keys.ENTER);
		//HP LP3065
		WebElement product = driver.findElement(By.linkText("HP LP3065"));
		Assert.assertTrue(product.isDisplayed());
		
	}
	
	@AfterTest
	public void exitBrowser() {
		quitBrowser();
	}
	

}
