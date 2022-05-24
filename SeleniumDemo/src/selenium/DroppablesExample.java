package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DroppablesExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium Plugins\\Web Drivers\\Chrome Driver\\ChromeDriver 100.0.4896.60.exe");
		
        WebDriver driver = new ChromeDriver();
			    
        driver.get("http://www.leafground.com/pages/drop.html");
        
        //  We should find the element which is draggable and where it will be dropped
        
        WebElement dragElement = driver.findElement(By.id("draggable"));
        WebElement dropElement = driver.findElement(By.id("droppable"));
        
        //  By importing Actions Class we have to perform some actions on the Web Pages
        
        Actions action = new Actions(driver);
        action.clickAndHold(dragElement).moveToElement(dropElement).release(dragElement).build().perform();  //  build() & perfrom() is a needed methods otherwise it didn't works
        
        //  another way
        
        //  action.dragAndDrop(dragElement, dropElement).build().perform();

	}

}
