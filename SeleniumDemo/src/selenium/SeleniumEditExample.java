package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumEditExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium Plugins\\Web Drivers\\Chrome Driver\\ChromeDriver 100.0.4896.60.exe");
		
	    WebDriver driver = new ChromeDriver();
	    
	    driver.get("http://www.leafground.com/pages/Edit.html");
	    
	    WebElement emailbox = driver.findElement(By.id("email"));
	    emailbox.sendKeys("test123@gmail.com");
	    
	    WebElement appendbox = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/input"));
	    appendbox.sendKeys("Hi Hello");
	    
	    WebElement getTextBox = driver.findElement(By.name("username"));
	    String value = getTextBox.getAttribute("value");
	    
	    System.out.println(value);
	    
	    WebElement clearbox = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div/div/input"));
	    clearbox.clear();
	    
	    WebElement disableBox = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[5]/div/div/input"));
	    boolean enabled = disableBox.isEnabled();
	    
	    System.out.println(enabled);
	    
	    

	}

}
