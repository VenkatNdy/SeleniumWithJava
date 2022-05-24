package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageObjects.PageFactoryObjects;


public class PageFactoryTestCase {
	
	@Test
	public void login() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium Plugins\\Web Drivers\\Chrome Driver\\ChromeDriver 100.0.4896.60.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		//  To overcome the dependency we didn't create objects for the LoginPageObjects class
		
		Thread.sleep(3000);
		
		//  initElements() is used to pass the WebDriver to access the WebElements from the PageFactoryObjects class
		
		PageFactory.initElements(driver, PageFactoryObjects.class);
	
		PageFactoryObjects.username.sendKeys("7639325431");
	
		PageFactoryObjects.password.sendKeys("Flip@7639");
	
		PageFactoryObjects.login.click();
		
		Thread.sleep(3000);
		
		driver.quit();
	
	}

}
