package loginTestCases;

import java.io.FileReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.opencsv.CSVReader;

public class ReadCsvFile {
	
	WebDriver driver;
	String baseUrl = "https://www.google.com";
	String csvFile = "D:\\Notes\\OpenCsv.txt";
	
	@BeforeClass
	public void openBrowser()
	{
		System.setProperty("webdriver.gecko.driver", "D:\\Web Drivers\\Firefox Gecko Driver\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
	  //driver.manage().timeouts().implicitlyWait(30,TimeUnit,SECONDS);
		
	}
	
	@Test
	public void verifySearch()
	{
		driver.get(baseUrl);
		CSVReader reader = null;
		try 
		{
			reader = new CSVReader(new FileReader(csvFile));
			String cell[] = reader.readNext();
			
			while((cell = reader.readNext())!=null)
			{
				String keyword = cell[0];
				driver.findElement(By.name("q")).sendKeys(keyword);
				System.out.println("System Enters Search Keyword");
				Thread.sleep(3000);
				driver.findElement(By.name("q")).clear();
				System.out.println("System Clears the Search Keyword");
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
