package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PageFactoryObjects {
	
	//  @FindBy() gets the value in it once the WebDriver passes into the class from the actual Test Case, it will populates the value to the assigned variable
	
	
	@FindBy(how = How.XPATH,using = "//input[@type = 'text' ][@class = '_2IX_2- VJZDxU' ]")
	public static WebElement username;
	
	@FindBy(how = How.XPATH,using ="//input[@type = 'password' ][@class = '_2IX_2- _3mctLh VJZDxU' ]")
	public static WebElement password;
	
	@FindBy(how = How.XPATH,using ="//button[@type = 'submit' ][@class = '_2KpZ6l _2HKlqd _3AWRsL' ]")
    public static WebElement login;

}
