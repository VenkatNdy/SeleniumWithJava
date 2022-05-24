package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumFirefoxDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Testing with Links
		
		
		System.setProperty("webdriver.gecko.driver", "D:\\Web Drivers\\Firefox Gecko Driver\\geckodriver.exe");  // We can set the Web driver name and its executable file location here
		
		WebDriver driver = new FirefoxDriver();  // It creates a object for the Webdriver we can access through it
		
		driver.get("https://www.google.co.in");  // Get method simple takes to the url that we entered into it
		
		driver.findElement(By.name("q")).sendKeys("trichy"+Keys.ENTER); // findElement is a method to find the web elements and SendKeys method simply enters the string that we entered into it 
		
		driver.findElement(By.partialLinkText("Wikipedia")).click();  // partialLinkText is a method that not require to enter the entire Text of the Link
		
		driver.close();  // It simply quits the window

	}

}
