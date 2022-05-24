package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium Plugins\\Web Drivers\\Chrome Driver\\ChromeDriver 100.0.4896.60.exe");
		
        WebDriver driver = new ChromeDriver();
			    
        driver.get("http://www.leafground.com/pages/frame.html");
        
        //  Now the control should be transferred to the frame because the button for the case 1 is placed inside the frame
        
        driver.switchTo().frame(0);  // In such case for the frames having no such finding attributes we can give as numbers starts from 0,1,2,..
        
        WebElement button1 = driver.findElement(By.id("click"));
        button1.click();
        
        //  We can take the changed text after the button has been pressed 
        
        String text = driver.findElement(By.id("click")).getText();
        System.out.println(text);
        
        driver.switchTo().defaultContent(); // Here for the frame handling we should have to change the control to the default web page
        
        //  Now we should tranfer the control in the order of frames
        //  For the case2 the button has been placed in the nested frames so we pass the control by frame by frame 
        driver.switchTo().frame(1);
        driver.switchTo().frame("frame2");  //  The frame is mapped with name and id so we can straightly enter it
        
        WebElement button2 = driver.findElement(By.id("click1"));
        button2.click();
        
        driver.switchTo().defaultContent();
        
        List<WebElement> totalFrames = driver.findElements(By.tagName("iframe"));   // here we have to check more than one elements(frames) so findElements() is used
        
        // findElements() simple returns a generic list so we saved as in the list format
        
        int size = totalFrames.size();
        System.out.println(size);
	}

}
