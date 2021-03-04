package baseClass;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Driver {

	@BeforeSuite
	public void oneTimeSetup()
	
	{
		System.out.println("Copy plugings and config files");
		System.out.println("Stop unneccasry services");
		System.out.println("Login to all the dependent servers");
		System.out.println("Install all the required games");
	}
	
	@AfterSuite
	public void oneTimeTearDown()
	{
		System.out.println("Kill the services");
	}
	
}
