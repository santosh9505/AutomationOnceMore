package achievements;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DBErrors extends TC_AchievementPrecondition {

	
	@BeforeClass
	public  void dbErrorPreconditions() 
	
	{	
	System.out.println("Update config files to 20 from 900");
    System.out.println("Run the jobs");
    System.out.println("Update DB settings");
	}
	
	@AfterClass
	public void dbErrorsPostCondition()
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
		System.out.println("Achievement DBErrors test1");
	}
	@Test
	public void test2()
	{
		System.out.println("Achievement DBErrors test2");
	}
	@Test
	public void test3()
	{
		System.out.println("Achievement DBErrors test3");
	}
	@Test
	public void test4()
	{
		System.out.println("Achievement DBErrors test4");
	}
	@Test
	public void test5()
	{
		System.out.println("Achievement DBErrors test5");
	}
	@Test
	public void test6()
	{
		System.out.println("Achievement DBErrors test6");
	}
	
	//public void achievements_saveAchievement_userInitiated()
	//{
//		try
//		{
//			//Create user
//			System.out.println("create user");
//			
//			//Upload test data
//			System.out.println("Upload test data");
//			
//			//first spin
//			System.out.println("First Spin");
//			
//			//Second Spin
//			System.out.println("Second Spin");
//			
//			// insert error
//			System.out.println("Insert Error  in db");
//			
//			// Third Spin
//			
//			//validate error in log file
//			
//			//validate log file
//			
//			//Revert the change
//			
//			
//			
//			
//		}catch(Exception e)
//		{
//			
//		}
//		finally {
//			
//		}
	}

