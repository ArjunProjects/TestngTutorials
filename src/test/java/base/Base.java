package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
	public static WebDriver driver=null;
	
	public static void launchBrowser() {
		driver = new ChromeDriver();
	}
	
	public static void launchApp() {
		driver.get("https://tutorialsninja.com/demo/");
	}
	
	
	public static void quitBrowser() {
		driver.quit();
	}

}
