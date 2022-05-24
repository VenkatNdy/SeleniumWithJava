package selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium Plugins\\Web Drivers\\Chrome Driver\\ChromeDriver 100.0.4896.60.exe");
		
        WebDriver driver = new ChromeDriver();
			    
        driver.get("http://www.leafground.com/pages/Window.html");
        
        String oldWindow = driver.getWindowHandle(); // getWindowHandle() is used to get the current working window
        
        WebElement clickHome = driver.findElement(By.id("home"));
        clickHome.click();
        
        Set<String> handles = driver.getWindowHandles(); // Set<String> is a generic type with a variable name & getWindowHandles() used to store the additional opening windows in the Set
        
        for (String newWindow : handles)  // It iterates values alonging in the handles--> (old window + new Window), once it starts iterate the new window it will go to the string
        { 
			driver.switchTo().window(newWindow);
		}
        
        WebElement editBox = driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[1]/a/h5"));
        editBox.click();
        driver.close();  // close() is used to close the new window
        
        driver.switchTo().window(oldWindow);  //  now the control will be transfered to the oldWindow
        
        WebElement multipleWindow = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/button"));
        multipleWindow.click();
        
        int numberOfWindows = driver.getWindowHandles().size();
        System.out.println("No of Windows : "+numberOfWindows);
        
        WebElement dontCloseMe = driver.findElement(By.id("color"));
        dontCloseMe.click();
        
        Set<String> newWindowHandles = driver.getWindowHandles();
        
        for (String allWindows : newWindowHandles)   //  newWindowHandles contains all windows and iterate one by one to allWindows
        {
			if(!allWindows.equals(oldWindow))    //  it compares the iterable windows is not equal to parent window (oldWindow) 
			{
				driver.switchTo().window(allWindows);  // if the condition will be true then it transfers control from the Webdriver to newWindow
				
				driver.close();                            // then the newWindow will be closed
			}
		}
        
        driver.quit();  // it will closes all the windows alonging from the driver
	}

}
