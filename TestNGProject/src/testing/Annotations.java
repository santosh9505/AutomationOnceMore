package testing;

import org.testng.annotations.Test;

public class Annotations {

	
	@Test(priority =0) // can set priority this way (priority =0) it will be first priority
	public void test1() // execution will be in alfa-numeric order in TestNG in defult priority
	{
		System.out.println("Test case 1");
	}
	@Test(priority =2)
	public void test2()
	{
		System.out.println("Test case 2");
	
	}
	@Test(priority =1)
	public void test3()
	{
		System.out.println("Test case 3");
	}
	}
	
	
	
	

