package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestSuiteExample {
	
	
	//  Aim: Open chrome browser and Goto Google, Bing and Yahoo one by one and close 
	
	@Test
	public void openGoogle()
	{
		long startTime = System.currentTimeMillis();  //  currentTimeMillis() is used to get the system's current time in milli seconds
		
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium Plugins\\Web Drivers\\Chrome Driver\\ChromeDriver 100.0.4896.60.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");  // Get method simple takes to the url that we entered into it
		
		driver.quit();
		
		long endTime = System.currentTimeMillis();
		
		long totalTime = endTime - startTime;
		
		System.out.println("Time Taken for Google "+ totalTime);

	}
	
	@Test
	public void openBing()

	{
		long startTime = System.currentTimeMillis();
		
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium Plugins\\Web Drivers\\Chrome Driver\\ChromeDriver 100.0.4896.60.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.bing.com");  // Get method simple takes to the url that we entered into it
		
		driver.quit();
		
		long endTime = System.currentTimeMillis();
		
		long totalTime = endTime - startTime;
		
		System.out.println("Time Taken for Bing "+ totalTime);


	}
	
	@Test
	public void openYahoo()
	{
		long startTime = System.currentTimeMillis();
		
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium Plugins\\Web Drivers\\Chrome Driver\\ChromeDriver 100.0.4896.60.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.yahoo.com");  // Get method simple takes to the url that we entered into it
		
		driver.quit();
		
		long endTime = System.currentTimeMillis();
		
		long totalTime = endTime - startTime;
		
		System.out.println("Time Taken for Yahoo "+ totalTime);


	}
}
