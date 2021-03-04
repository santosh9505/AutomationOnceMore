package timersAndSweepers;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import baseClass.Driver;

public class TC_TimersAndSweepers_Precondition extends Driver {
	
	@BeforeTest
	public void timersAndSweepersPreCondition()
	{
		System.out.println("Stop the services");
		System.out.println("Copy config files related to timersAndSweepers module");
		System.out.println("Restart the services");
	}

	@AfterTest
	public void timersAndSweepersPostCondition()
	{
		System.out.println("Kill the services");
		
	}


}
