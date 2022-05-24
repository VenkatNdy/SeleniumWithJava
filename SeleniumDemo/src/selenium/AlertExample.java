/**
 * 
 */
package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author Venkat
 *
 */
public class AlertExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium Plugins\\Web Drivers\\Chrome Driver\\ChromeDriver 100.0.4896.60.exe");
		
        WebDriver driver = new ChromeDriver();
			    
        driver.get("http://www.leafground.com/pages/Alert.html");
        
        WebElement alertBox = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div/div/button"));
        alertBox.click();
        
        Alert alert = driver.switchTo().alert();  // Alert is an interface that will helps to changing controls from the working webdriver to the alert window
        alert.accept();  // Accept function is simply used to accept the displaying alert window by clicking ok on it
        
        WebElement confirmBox = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/button"));
        confirmBox.click();
        
        Alert confirm = driver.switchTo().alert();
        confirm.dismiss();  // Dismiss function is used to select the cancel button on the alert window
        
        WebElement promptBox = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/button"));
        promptBox.click();
        
        Alert prompt = driver.switchTo().alert();
        prompt.sendKeys("TestLeaf");
        prompt.accept();
        
        WebElement lineBreakButton = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div/div/button"));
        lineBreakButton.click();
        
        Alert lineBrButton = driver.switchTo().alert();
        lineBrButton.accept();  // Because the last button only to indicate the line breaks in the alert window


	}

}
