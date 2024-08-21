package com.tutorialsninja.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import base.Base;

public class SoftAndHardAssertDemo extends Base{
	
	/*
	 * SoftAssert vs HardAsset
	 * HardAsset will stop the execution when the first verification fails and remaining code will not be executed
	 * SoftAssertion will continue the execution even if it fails and it will throw the error once the entire test is completed
	 */
	
	@Test
	public void sampleMethod() {
		
		launchBrowser();
		driver.manage().window().maximize();
		launchApp();
		SoftAssert softAssert = new SoftAssert();
		String actualTitle = driver.getTitle();
		String expectedTitle = "Test"; //Your Store is the expected title
		softAssert.assertEquals(actualTitle, expectedTitle);
		
		String actualUrl = driver.getCurrentUrl();
		String expectedUrl = "https://tutorialsni.com";
		softAssert.assertEquals(actualUrl, expectedUrl); //We are deliberately failing the validation to use SoftAssert
		
		 driver.findElement(By.xpath("//input[@name='search']")).sendKeys("HP",Keys.ENTER);
		 WebElement product = driver.findElement(By.linkText("HP LP3065"));
		 Assert.assertTrue(product.isDisplayed());
		 quitBrowser();
		 softAssert.assertAll();
		
	}

}
