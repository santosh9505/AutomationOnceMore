package timersAndSweepers;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class UserInitiated extends TC_TimersAndSweepers_Precondition {

	@BeforeClass
	public  void UserInitiatedPreconditions() 
	
	{	
	System.out.println("Precondition UserInitiated Test");
    
	}
	
	@AfterClass
	public void UserInitiatedCondition()
	{
		System.out.println("Revert back the changes made in the before class");
	}
	
	@BeforeMethod
	public void commonPreconditionForAlltheTestCases()
	{
		System.out.println("Delete the log files");
	}
	
	@AfterMethod
	public void commonPostCondition()
	{
		System.out.println("Common post condition for all the test cases");
		System.out.println("clear global variables data");
	}
	@Test
	public void test1()
	{
		System.out.println("UserInitiated test1");
	}
	@Test
	public void test2()
	{
		System.out.println("UserInitiated test2");
	}
	@Test
	public void test3()
	{
		System.out.println("UserInitiated test3");
	}
}

