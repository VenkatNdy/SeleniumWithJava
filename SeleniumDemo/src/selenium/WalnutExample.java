package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WalnutExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		// opens chrome driver 
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium Plugins\\Web Drivers\\Chrome Driver\\ChromeDriver 100.0.4896.60.exe");
        WebDriver driver = new ChromeDriver();	
        driver.manage().window().maximize();  //  To display the window in the maximize view
        
        driver.get("http://www.google.co.in");
        
        driver.findElement(By.name("q")).sendKeys("Walnut Infotech"+Keys.ENTER);
        driver.findElement(By.xpath("//h3[text()='Walnut Infotech - Walnut Infotech Inc']")).click();
        
        WebElement messagingTab = driver.findElement(By.xpath("//*[@data-aid = 'MESSAGING_FAB']"));
        messagingTab.click();
        System.out.println("Chat Box Clicked");
        Thread.sleep(2000);
        
        WebElement nameTab = driver.findElement(By.xpath("//*[@data-aid = 'MESSAGING_FORM_NAME'][@role='textbox']"));
        nameTab.sendKeys("Venkat");
        System.out.println("Name Entered");
        Thread.sleep(2000);
        
        WebElement emailBox = driver.findElement(By.xpath("//*[@data-aid = 'MESSAGING_FORM_EMAIL'][@role='textbox']"));
        emailBox.sendKeys("ndyvenkat@gmail.com");
        System.out.println("Mail Entered");
        Thread.sleep(2000);
        
        WebElement helpBox = driver.findElement(By.xpath("//*[@data-aid = 'How can we help?'][@role='textbox']"));
        helpBox.sendKeys("This is an Automated Mail");
        System.out.println("Commented on Help Box");
        
        WebElement sendButton = driver.findElement(By.xpath("//*[@data-aid = 'MESSAGING_SUBMIT_BUTTON_REND'][@type='submit']"));
        sendButton.click();
        System.out.println("Send Button Clicked");
        
        
        

	}

}
