package com.tutorialsninja.tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HandlingDependsOnMethod {

	public WebDriver driver = null;
	
	/*
	 * if dependent test fails then remaining tests will be skipped if you use dependsOnMethods attribute
	 * if you alwaysRun = true then tests which are dependent on other test will be executed
	 */
	
	@Test
	public void userLogin() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("amotooricap1@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("12345676");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		Assert.assertTrue(driver.findElement(By.linkText("Edit your account information")).isDisplayed());
		
	}
	
	@Test(dependsOnMethods= {"userLogin"},alwaysRun=true)
	public void addProductToWishList() {
		
		driver.findElement(By.xpath("//div[@id='search']//input")).sendKeys("HP");
		driver.findElement(By.xpath("//div[@id='search']//span")).click();
		driver.findElement(By.xpath("//button[@data-original-title='Add to Wish List']")).click();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		WebElement el = wait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Wish List")));
		//driver.findElement(By.linkText("wish list")).click();
		el.click();
		
	}
	
	@Test(dependsOnMethods= {"userLogin","addProductToWishList"})
	public void removeProductFromWishList() {
		driver.findElement(By.xpath("//a[@data-original-title='Remove']")).click();
		WebElement actual = driver.findElement(By.xpath("//div[@id='content']//p"));
		Assert.assertTrue(actual.getText().equals("Your wish list is empty."));
	}
}
