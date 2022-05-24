package testNG;

import org.testng.annotations.Test;

public class SkipTestCaseExample {
	
	@Test(priority = 0)
	public void startTheCar()
	{
		System.out.println("Car Started");
	}
	
	@Test(priority = 5,enabled = false)
	public void turnTheMusicOn()
	{
		System.out.println("Music Turned On");
	}
	
	@Test(priority = 1)
	public void putFirstGear()
	{
		System.out.println("Changed to Gear 1");
	}
	
	@Test(priority = 2)
	public void putSecondGear()
	{
		System.out.println("Changed to Gear 2");
	}
	
	@Test(priority = 3)
	public void putThirdGear()
	{
		System.out.println("Changed to Gear 3");
	}
	
	@Test(priority = 4)
	public void putFourthGear()
	{
		System.out.println("Changed to Gear 4");
	}

}
