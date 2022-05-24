package selenium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium Plugins\\Web Drivers\\Chrome Driver\\ChromeDriver 100.0.4896.60.exe");
		
		WebDriver driver = new ChromeDriver();  
		
		driver.navigate().to("http://www.leafground.com/pages/table.html"); 
		
		List<WebElement> column = driver.findElements(By.tagName("th"));
		int columnCount = column.size();
		System.out.println("Total No of Columns in the Table : "+columnCount);
		
		List<WebElement> row = driver.findElements(By.tagName("tr"));
		int rowCount = row.size();
		System.out.println("Total No of Rows in the Table : "+rowCount);
		
		WebElement getPercent = driver.findElement(By.xpath("//td[normalize-space()=\"Learn to interact with Elements\"]//following::td[1]"));  // normalize-space() truncates the spaces before and after the  given string
		String percent = getPercent.getText();
		System.out.println("The Progress Value is : "+ percent);
		
		List<WebElement> allProgress = driver.findElements(By.xpath("//td[2]"));  // By this xpath it finds all the column details (all Progresses)
		
		List<Integer> numberList = new ArrayList<Integer>();  // This generic type of list is created to store the all iterable items in a new list otherwise won't works because of the execution of loop
		
		for (WebElement webElement : allProgress)  // To iterate all the progresses one by one
		{
			String individualValue = webElement.getText().replace("%", ""); //  getText() captures the progress as a string and replace() will remove the % symbol from the String
			numberList.add(Integer.parseInt(individualValue));  //  Integer.ParseInt() converts the particular string into integer format
			
		}
		
		System.out.println("The Final NumberList : "+numberList);
		
		int smallValue = Collections.min(numberList);
		System.out.println(smallValue);
		
		String smallValueString = Integer.toString(smallValue)+"%";
		String finalXpath = "//td[normalize-space()=" + "\"" + smallValueString + "\"" + "]" + "//following::td[1]";   // Customized Xpath Creation with Escape Characters
		System.out.println("Customized xPath : "+ finalXpath);
		
		WebElement check = driver.findElement(By.xpath(finalXpath));
		check.click();
		

	} 

}
