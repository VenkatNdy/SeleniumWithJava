package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class PageFactoryWithoutAnnotation {
	
	//  If we declare all the variables [ Here we declare WebElements directly as variables ] in non static, it will throws the null pointer exception while executing the application
	
	//  It gets only Executed while the web page contains either id or name attributes 
	
	public static WebElement txtUsername;
	public static WebElement txtPassword;
	public static WebElement btnLogin;
	
	@Test
	public void login() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium Plugins\\Web Drivers\\Chrome Driver\\ChromeDriver 100.0.4896.60.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/validateCredentials");
		
		PageFactory.initElements(driver, PageFactoryWithoutAnnotation.class);	
		
		txtUsername.sendKeys("Admin1");
		txtPassword.sendKeys("admin123");
		btnLogin.click();
		
				
	}	

}
