package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class BeforeAndAfterSuiteAnnotationsExample {
	
	WebDriver driver;            //  By declaring these instances globally it scopes extends and it can be used by anywhere in this program
	long startTime;
	long endTime;
	
	@BeforeSuite                //  It executes the code before the execution of all the  Test cases
	public void launchBrowser()
	{
		startTime = System.currentTimeMillis();  //  currentTimeMillis() is used to get the system's current time in milliseconds
		
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium Plugins\\Web Drivers\\Chrome Driver\\ChromeDriver 100.0.4896.60.exe");
		
		driver = new ChromeDriver();
	}
	
	@Test                         //  @Test Annotation Refers the method as a Test Case
	public void openGoogle()
	{
		driver.get("https://www.google.com");
	}
	
	@Test
	public void openBing()
	{
		driver.get("https://www.bing.com");
	}
	
	@Test
	public void openYahoo()
	{
		driver.get("https://www.yahoo.com");
	}
	
	@AfterSuite                               //  It executes the code after the execution of all the Test Cases
	public void closeBrowser()
	{
		driver.quit();
		
	    endTime = System.currentTimeMillis();
		
		long totalTime = endTime - startTime;
		
		System.out.println("Time Taken "+ totalTime);
	}
}
