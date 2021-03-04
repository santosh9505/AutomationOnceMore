package testing;

import org.testng.annotations.Test;

public class AnnotationsClass2 {
	@Test(priority = 0)
	public void login() throws Exception
	{
		System.out.println("Login test");
		
		throw new Exception("Some exception occured while login");
	}
	@Test(priority = 1,dependsOnMethods = {"login"})
	public void sendMail()
	{
		System.out.println("sendEmail test");
	}
	@Test(priority = 2,dependsOnMethods = {"sendMail"})
	public void logout()
	{
		System.out.println("Login test");
	}

}
