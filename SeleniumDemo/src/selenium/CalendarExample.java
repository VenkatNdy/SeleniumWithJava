package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		System.setProperty("webdriver.chrome.driver", "F:\\Selenium Plugins\\Web Drivers\\Chrome Driver\\ChromeDriver 100.0.4896.60.exe");
		
        WebDriver driver = new ChromeDriver();
			    
        driver.get("http://www.leafground.com/pages/Calendar.html");
        
        //  This is only for the JQuery Calendar type
        
        //  We can done this by two ways  
        
        //  1. By applying the specified date format through sendkeys()
        
        WebElement calendar = driver.findElement(By.id("datepicker"));
        
        //  calendar.sendKeys("10/11/2021" + Keys.ENTER);
        
        //  2. By traversing through the calendar
        
        calendar.click();
        
        WebElement nextButton = driver.findElement(By.xpath("//a[@title=\"Next\"]"));
        nextButton.click();
        
        WebElement dateToBeGiven = driver.findElement(By.xpath("//a[contains(text(),'10')]"));
        dateToBeGiven.click();
        
        
        

	}

}
