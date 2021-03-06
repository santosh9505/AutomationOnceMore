package achievements;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FunctionalTesting extends TC_AchievementPrecondition {

	@BeforeClass
	public  void FunctionalTestingPreconditions() 
	
	{	
	System.out.println("Update config files to 20 from 900");
    System.out.println("Run the jobs");
    System.out.println("Update DB settings");
	}
	
	@AfterClass
	public void FunctionalTestingPostCondition()
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
		System.out.println("Achievement FunctionalTesting test1");
	}
	@Test
	public void test2()
	{
		System.out.println("Achievement FunctionalTesting test2");
	}
	@Test
	public void test3()
	{
		System.out.println("Achievement FunctionalTesting test3");
	}

	}


