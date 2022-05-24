package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObjects {
	
	// To overcome the dependency here all the methods are declared as static}
	
	public static WebElement username(WebDriver driver)
	{
		return driver.findElement(By.xpath("//input[@type = 'text' ][@class = '_2IX_2- VJZDxU' ]"));
	}
  
	public static WebElement password(WebDriver driver)
	{
		return driver.findElement(By.xpath("//input[@type = 'password' ][@class = '_2IX_2- _3mctLh VJZDxU' ]"));
	}
	
	public static WebElement login(WebDriver driver)
	{
		return driver.findElement(By.xpath("//button[@type = 'submit' ][@class = '_2KpZ6l _2HKlqd _3AWRsL' ]"));
	}
	

}
