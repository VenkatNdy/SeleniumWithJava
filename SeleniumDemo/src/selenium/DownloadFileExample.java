package selenium;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DownloadFileExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium Plugins\\Web Drivers\\Chrome Driver\\ChromeDriver 100.0.4896.60.exe");
		
        WebDriver driver = new ChromeDriver();
			    
        driver.get("http://www.leafground.com/pages/download.html");
        
        WebElement downloadLink = driver.findElement(By.linkText("Download Excel"));
        downloadLink.click();
        
        File fileLocation = new File("C:\\Users\\G3Orbit1\\Downloads");
        File[] totalFiles = fileLocation.listFiles();
        
        for (File file : totalFiles) 
        {
			if(file.getName().equals("testleaf.xlsx"))
			{
				System.out.println("File Downloaded Successfully");
				break;
			}
		}
        
        

	}

}
