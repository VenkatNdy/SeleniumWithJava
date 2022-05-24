package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionExample {
	
	//  Assertion is predominantly used for unit testing
	
	String name = "Madan";
	
	String subject = "Math";
	
	boolean dayscholar = true;
	
	@Test
	public void check()
	{
		/* if(name.equals("Madan"))
		{
			System.out.println("Name is Madan");
		}
		else
		{
			System.out.println("Different Name Encountered");
		}  */
		
		Assert.assertEquals(name, "Madan");   // Assertion is used to check whether the value is equal to the expected value
		
		//Assert.assertNotEquals(subject, "Math");
		
		//Assert.assertTrue(dayscholar);
		
		//Assert.assertFalse(dayscholar);
	}

}
