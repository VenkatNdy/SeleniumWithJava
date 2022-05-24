package loginTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Login {
	
	String data [] [] = {
			{"Admin","admin123"},
			{"admin","admin"},
			{"Admin","admin"},
			{"admin","admin123"}
	};
	
	@DataProvider(name = "Login Data")
	public String[][] loginDataProvider()
	{
		return data;
	}
	
	public void getExcelData()
	{
		
	}
	
	@Test(dataProvider = "Login Data")
	public void login(String username, String password)
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium Plugins\\Web Drivers\\Chrome Driver\\ChromeDriver 100.0.4896.60.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/validateCredentials");
		
		WebElement userNameBox = driver.findElement(By.id("txtUsername"));
		userNameBox.sendKeys(username);
		
		WebElement passwordBox = driver.findElement(By.id("txtPassword"));
		passwordBox.sendKeys(password);
		
		WebElement loginButton = driver.findElement(By.id("btnLogin"));
		loginButton.click();
		
		driver.quit();
	}
	

}
