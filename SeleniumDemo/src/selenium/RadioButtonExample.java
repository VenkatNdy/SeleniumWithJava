package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium Plugins\\Web Drivers\\Chrome Driver\\ChromeDriver 100.0.4896.60.exe");
		
        WebDriver driver = new ChromeDriver();
			    
        driver.get("http://www.leafground.com/pages/radio.html");
        
        WebElement case1 = driver.findElement(By.id("yes"));
        case1.click();
        
        WebElement case2a = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/label[2]/input"));
        WebElement case2b = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/label[3]/input"));
        boolean status1 = case2a.isSelected();
        boolean status2 = case2b.isSelected();
        
        System.out.println(status1);
        System.out.println(status2);
        
        WebElement case3 = driver.findElement(By.name("age"));
        case3.click();
        

	}

}
