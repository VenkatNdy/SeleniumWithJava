package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pageObjects.LoginPageObjects;

public class LoginPageTestCase {
	
	
	@Test
	public void login() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium Plugins\\Web Drivers\\Chrome Driver\\ChromeDriver 100.0.4896.60.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		// To overcome the dependency we didn't create objects for the LoginPageObjects class
		
		Thread.sleep(3000);
		
		LoginPageObjects.username(driver).sendKeys("7639325431");
		
		LoginPageObjects.password(driver).sendKeys("Flip@7639");
		
		LoginPageObjects.login(driver).click();
		
		Thread.sleep(3000);		
		
		driver.quit();
		
		
		
		
	}

}
