package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumChromeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Testing with Links
		
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium Plugins\\Web Drivers\\Chrome Driver\\ChromeDriver 100.0.4896.60.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.co.in");
		
		driver.findElement(By.name("q")).sendKeys("trichy"+ Keys.ENTER); // Keys is used to perform some keyboard keys functionalities
		
		driver.findElement(By.linkText("Tiruchirappalli - Wikipedia")).click(); // Click method simply clicks on the target
		
		driver.quit();

	}

}
