package testNG;

import org.testng.annotations.Test;

public class SampleTestCase {
	
	@Test                                       // Adding annotation to the method it will becomes a test case according to the automaton framework
	public void firstTestCase()
	{
		System.out.println("This is the First Test Case");
		
	}
	
	@Test
	public void secondTestCase()
	{
		System.out.println("This is the Second Test Case");
		
	}	
	
	@Test
	public void thirdTestCase()
	{
		System.out.println("This is the Third Test Case");
		
	}	
	
	@Test
	public void fourthTestCase()
	{
		System.out.println("This is the Fourth Test Case");
		
	}

}
