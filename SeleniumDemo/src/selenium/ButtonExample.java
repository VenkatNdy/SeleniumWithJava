package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium Plugins\\Web Drivers\\Chrome Driver\\ChromeDriver 100.0.4896.60.exe");
				
        WebDriver driver = new ChromeDriver();
			    
        driver.get("http://www.leafground.com/pages/Button.html");
        
        // Changing the implementation order for a reason   -----    To avoid this refer HyperLinksExample
        
        WebElement getPositionButton = driver.findElement(By.id("position"));
        
        Point xypoint = getPositionButton.getLocation();  // Point is the class is used to find the location  
        int xvalue = xypoint.getX();
        int yvalue= xypoint.getY();
        
        System.out.println("Value of X is "+xvalue+" Value of Y is "+yvalue);
        
        // To find the button color
        
        WebElement getColourButton = driver.findElement(By.id("color"));
        String color = getColourButton.getCssValue("background-color");  //  getCssValue() simply returns the value
        
        System.out.println("Button Color is "+color);
        
        // To find the button size
        
        WebElement getSizeButton = driver.findElement(By.id("size"));
        int height = getSizeButton.getSize().getHeight();  //  getSize() is a inbuilt method that is used to find the height & width of the button
        int width = getSizeButton.getSize().getWidth();
        
        System.out.println("Height and Width of the Button is "+height+" & "+width);
        
        //  By pressing this home button it will redirects the page to home page
        
        WebElement homeButton = driver.findElement(By.id("home"));
        homeButton.click();
        
        
        

	}

}
