package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoCompleteExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium Plugins\\Web Drivers\\Chrome Driver\\ChromeDriver 100.0.4896.60.exe");
		
        WebDriver driver = new ChromeDriver();
			    
        driver.get("http://www.leafground.com/pages/autoComplete.html");
        
        WebElement inputBox = driver.findElement(By.id("tags")); //  To find the autocomplete text box 
        inputBox.sendKeys("s");  //  Here we have to send some input through send keys
        
        Thread.sleep(3000);  //Explicit Wait for a reason 
        
        List<WebElement> optionList = driver.findElements(By.xpath("//*[@id=\"ui-id-1\"]/li"));  //  List of Options are there so we use the findElements() 
        int size = optionList.size();
        System.out.println("List of Options : "+size);
        
        
        for (WebElement webElement : optionList)  //  For loop iterates the optionList one by one through webElement
        {
			if(webElement.getText().equals("Selenium"))  // Here if checks the condition whether the webElement is equals to the desired Option
			{                                           //  Check with option Selenium without break to find the difference in execution
				webElement.click();
				System.out.println("If Part");
				break;                                      // Break is used to terminates the loop execution after the required conditon reached
			}
			else
			{
				System.out.println("Else Part");
			}
		}
        
        


	}

}
