package selenium;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartAutoDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		// opens chrome driver 
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium Plugins\\Web Drivers\\Chrome Driver\\ChromeDriver 100.0.4896.60.exe");
        WebDriver driver = new ChromeDriver();	
        driver.manage().window().maximize();  //  To display the window in the maximize view

        
        //  opens google search engine          
        driver.get("http://www.google.co.in");
        String title = driver.getTitle();
        System.out.println("Current Web Driver : " + title);

        //  searching and selecting the flipkart site        
        driver.findElement(By.name("q")).sendKeys("flipkart"+Keys.ENTER);
        driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div/div[1]/a/h3")).click();        
        Thread.sleep(3000);
        
        //  closes the login popup and search for a product       
        driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
        String searchItem = "iqoo mobile";
        driver.findElement(By.name("q")).sendKeys(searchItem); 
        WebElement searchIcon = driver.findElement(By.className("L0Z3Pu"));
        searchIcon.click();
        System.out.println("Login Skipped");
        Thread.sleep(3000);
        
        //  Getting current window object        
        String parent = driver.getWindowHandle();
        System.out.println("Parent Window Id is " + parent);
        
        
        //  Selecting the searching product after clicked on that it will opens a new tab for displaying the product details        
        WebElement findModel = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[2]/div/div/div/a/div[2]/div[1]/div[1]"));
        findModel.click();
        System.out.println("New Window Opened");
        Thread.sleep(3000);
        
        // To identify how many tabs are running currently and get the objects by in the order of Set        
        Set<String> allWindows = driver.getWindowHandles();
        int count = allWindows.size();
        System.out.println("Total Windows " + count);
       
        
        //  To transfer the control to the new window         
        for (String childWindow : allWindows)
        {
			if(!parent.equalsIgnoreCase(childWindow))   //  here we compares the objects 
			{
				driver.switchTo().window(childWindow);  //  change the control
				
				
				// To find the login box and click				
				WebElement loginButton = driver.findElement(By.linkText("Login"));
		        loginButton.click();
		        System.out.println("Login Button Clicked");
		        Thread.sleep(3000);
		        
		        //  Enters UserId and Password and Logins
		        String username = "7639325431";
		        String password = "Flip@7639";
		        driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div/div[2]/div/form/div[1]/input")).sendKeys(username);
		        driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div/div[2]/div/form/div[2]/input")).sendKeys(password + Keys.ENTER);
		        System.out.println("Logged in Successfully");
		        Thread.sleep(3000);
		        
		        //  To cart the item 
		        WebElement cartButton = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[1]/div[2]/div/ul/li[1]/button"));
		        cartButton.click();
		        System.out.println("Item Added to the Cart ");
				
			}
		}
        
              
        
	}

}
