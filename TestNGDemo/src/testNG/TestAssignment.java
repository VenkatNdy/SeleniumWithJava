package testNG;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestAssignment {
	
	@Test
	public void openBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium Plugins\\Web Drivers\\Chrome Driver\\ChromeDriver 100.0.4896.60.exe");
		
		WebDriver driver = new ChromeDriver();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;

		
		driver.manage().window().maximize();
		
		
		driver.navigate().to("https://www.lambdatest.com/selenium-automation");
		
		WebDriverWait wait = new WebDriverWait(driver,30);
		
		String oldWindow = driver.getWindowHandle();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"__next\"]/div[1]/section[9]/div/div/div/div[2]/div/div[4]")));
		
		WebElement cicdTool = driver.findElement(By.xpath("//div[text() = \"CI/CD Tools\"]"));
		
		cicdTool.click();
		
		//WebElement learnMore = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/section[9]/div/div/div/div[2]/div/div[4]/div/div[2]/span/a"));
		
		//learnMore.click();
		
		String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL,Keys.RETURN); 
		
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/section[9]/div/div/div/div[2]/div/div[4]/div/div[2]/span/a")).sendKeys(selectLinkOpeninNewTab);
		
		Set<String> allWindows = driver.getWindowHandles();
		
		int count = allWindows.size();
        System.out.println("Total Windows " + count);
		
		
		
        for (String childWindow : allWindows)
        {
			if(!oldWindow.equalsIgnoreCase(childWindow))   //  here we compares the objects 
			{
				driver.switchTo().window(childWindow);  //  change the control
				
				String newTabId = driver.getTitle();
				
			    String checkId = "LambdaTest Integrations With CI/CD Tools | LambdaTest";
			     
			    Assert.assertEquals(newTabId, checkId);
			    
			  //Find element by link text and store in variable "Element"        		
		        WebElement bottomElement = driver.findElement(By.className("social_footer"));
		      
		        WebElement topElement = driver.findElement(By.className("h1Heading_27L5"));

		        //This will scroll the page till the element is found		
		        js.executeScript("arguments[0].scrollIntoView();", bottomElement);
		        
		        js.executeScript("arguments[0].scrollIntoView();",topElement);
		        
		        driver.close();
		        
		        driver.switchTo().window(oldWindow);
				
				WebDriverWait wait1 = new WebDriverWait(driver,30);
				
				js.executeScript("window.scrollTo(document.body.scrollHeight,0)");
				
				wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"header\"]/nav/div")));
				
				
				WebElement resource = driver.findElement(By.xpath("//button[text() = 'Resources ']"));
				  
				resource.click();
				
				WebElement newsLetter = driver.findElement(By.linkText("Newsletter"));
				  
				newsLetter.click();
				
				WebElement cookies = driver.findElement(By.xpath("//span[text() = 'Got it']"));
				  
				cookies.click();
				
				
				WebElement letMe = driver.findElement(By.partialLinkText("Let me read"));
				  
				letMe.click();
				
				WebElement textDemo = driver.findElement(By.xpath("//*[text()='All Editions']"));
				
				try {
					
					if(textDemo.isDisplayed())
					{
						System.out.println("News Letter is Open");
					}
					
					else
					{
						System.out.println("Element Not Found");
					}
					
					driver.quit();	
				} 
				catch (Exception e)
				{
					// TODO: handle exception
					e.printStackTrace();
				}
				
				
			
			}
				
        }
		
		 
		 
		 
	}

}
