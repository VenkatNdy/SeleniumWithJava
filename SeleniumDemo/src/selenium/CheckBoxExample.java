package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium Plugins\\Web Drivers\\Chrome Driver\\ChromeDriver 100.0.4896.60.exe");
		
        WebDriver driver = new ChromeDriver();
			    
        driver.get("http://www.leafground.com/pages/checkbox.html");
        
        WebElement case1 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div[1]/input"));
        case1.click();
        
        WebElement case2 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/input"));
        boolean status2 = case2.isSelected();
        
        System.out.println(status2);
        
        WebElement case3a = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div[1]/input"));
        if(case3a.isSelected())
        {
        	case3a.click();
        }
        
        WebElement case3b = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div[2]/input"));
        if(case3b.isSelected())
        {
        	case3b.click();
        }
        
        WebElement case4a = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div[1]/input"));
        case4a.click();
        
        WebElement case4b = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div[2]/input"));
        case4b.click();
        
        WebElement case4c = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div[3]/input"));
        case4c.click();
        
        WebElement case4d = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div[4]/input"));
        case4d.click();
        
        WebElement case4e = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div[5]/input"));
        case4e.click();



	}

}
