package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InteractWithImageExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium Plugins\\Web Drivers\\Chrome Driver\\ChromeDriver 100.0.4896.60.exe");
		
        WebDriver driver = new ChromeDriver();
			    
        driver.get("http://www.leafground.com/pages/Image.html");
        
        //  Changing the implementation order for a reason   -----    To avoid this refer HyperLinksExample
        
        WebElement brokenImage = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/img"));
        
        if(brokenImage.getAttribute("naturalWidth").equals("0"))  //  naturalWidth is one of the CSS property, if it is 0 then there is a broken image otherwise there is a complete image 
        {
        	System.out.println("The image is broken");
        }
        else
        {
        	System.out.println("The image is not broken");
        }
        
        // By clicking this image it will redirects to the home page
        
        
        WebElement firstImage = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div/div/img"));
        firstImage.click();

	}

}
