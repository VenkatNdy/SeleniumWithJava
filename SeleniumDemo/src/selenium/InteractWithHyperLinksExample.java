package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InteractWithHyperLinksExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium Plugins\\Web Drivers\\Chrome Driver\\ChromeDriver 100.0.4896.60.exe");

		WebDriver driver = new ChromeDriver();

		driver.navigate().to("http://www.leafground.com/pages/Link.html");    //  By using the navigate().to() instead of get() we can perform some navigational options like refresh,forward,back
		
		WebElement firstLink = driver.findElement(By.linkText("Go to Home Page"));
		firstLink.click();
		
		driver.navigate().back();   //  This will help to go back from the current page
		
		WebElement secondLink = driver.findElement(By.partialLinkText("Find"));
		String str = secondLink.getAttribute("href");
		
		System.out.println("The Second link is going to the page : "+str);
		
		WebElement thirdLink = driver.findElement(By.partialLinkText("Verify"));
		thirdLink.click();
		
		String title = driver.getTitle();      //  getTitle() simply returns the title of the page
		
		if(title.contains("404"))
		{
			System.out.println("The link is broken");
		}
		else
		{
			System.out.println("The link is active");
		}
         
		driver.navigate().back();
		
		// To interacting with the existing link
		
		WebElement fourthLink = driver.findElement(By.partialLinkText("Go to"));
		fourthLink.click();
		driver.navigate().back();
		
		// To find the number of links in the page by using findElements() 
		
		List<WebElement> linkList = driver.findElements(By.tagName("a"));
		int size = linkList.size();
		System.out.println("Total Number of Links in the Page is "+size);
		
		
	}

}
