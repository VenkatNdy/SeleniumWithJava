package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SelectableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium Plugins\\Web Drivers\\Chrome Driver\\ChromeDriver 100.0.4896.60.exe");
		
        WebDriver driver = new ChromeDriver();
			    
        driver.get("http://www.leafground.com/pages/selectable.html");
        
        // Here we choose xpath instead of id or name because it is in the collection format (list of elements are available)
        
        List<WebElement> selectable =  driver.findElements(By.xpath("//*[@id=\"selectable\"]/li"));  //  Here we add /li in the xpath to find each and every list after the selectable otherwise it consider only one object as ordered list
        int listSize = selectable.size();
        System.out.println(listSize);
        
        Actions action = new Actions(driver); 
        
        action.keyDown(Keys.CONTROL).click(selectable.get(0)).click(selectable.get(1)).click(selectable.get(2)).build().perform();
        
        // Another Way
        
        //action.clickAndHold(selectable.get(0)).clickAndHold(selectable.get(1)).clickAndHold(selectable.get(2)).build().perform();   
	}

}
