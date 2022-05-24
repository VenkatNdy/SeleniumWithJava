package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class AnnotationsHierarchyExample {
	
  @Test
  public void test1() {
	  System.out.println("Im Test 1");

  }
  @Test
  public void test() {
	  System.out.println("Im Test");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Im Before Method");

  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("Im After Method");

  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("Im Before Class");

  }

  @AfterClass
  public void afterClass() {
	  System.out.println("Im After Class");

  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("Im Before Test");

  }

  @AfterTest
  public void afterTest() {
	  System.out.println("Im After Test");

  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("Im Before Suite");

  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("Im After Suite");

  }

}
