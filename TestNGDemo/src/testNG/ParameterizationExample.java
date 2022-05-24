package testNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

//  The concept of parameterization is to get the value from the xml application to here

public class ParameterizationExample {
	
	@Test 
	
	@Parameters("Name")           //  The Parameters name will be the tracing point in the xml file
	public void printName(String name)

	{
		System.out.println("Name is " + name );
	}
}
