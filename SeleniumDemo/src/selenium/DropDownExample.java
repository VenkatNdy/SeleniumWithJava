package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium Plugins\\Web Drivers\\Chrome Driver\\ChromeDriver 100.0.4896.60.exe");
		
        WebDriver driver = new ChromeDriver();
			    
        driver.get("http://www.leafground.com/pages/Dropdown.html");
        
        WebElement dropDown1 = driver.findElement(By.id("dropdown1"));
        
        Select select1 = new Select(dropDown1);
        select1.selectByIndex(1);
        
        WebElement dropDown2 = driver.findElement(By.id("dropdown2"));
        
        Select select2 = new Select(dropDown2);
        select2.selectByValue("2");
        
        WebElement dropDown3 = driver.findElement(By.id("dropdown3"));
        
        Select select3 = new Select(dropDown3);
        select3.selectByVisibleText("UFT/QTP");
        
        WebElement dropDown = driver.findElement(By.id("dropdown"));
        
        Select select4 = new Select(dropDown);
        List<WebElement> ListofOptions = select4.getOptions();
        int size = ListofOptions.size();
        
        System.out.println("Number of Elements in Dropdown is "+size);
        
        WebElement dropDown5 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[5]/select"));
        dropDown5.sendKeys("Selenium");
        
        WebElement dropDown6 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[6]/select"));
        
        Select multiSelectBox = new Select(dropDown6);
        multiSelectBox.selectByIndex(1);
        multiSelectBox.selectByIndex(2);
        multiSelectBox.selectByIndex(3);
        
        

	}

}
