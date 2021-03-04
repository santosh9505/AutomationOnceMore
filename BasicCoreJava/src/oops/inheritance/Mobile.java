package oops.inheritance;

public class Mobile extends Telephone {
	
	public void texting()
	{
		System.out.println("Texting from Mobile");
	}
	
	public void calling()  // Method Overriding : parameters and name should be same, 
	                       // whenever we have 1 function in parent and child class with same name and same parameters 
	                       // then it is called method overriding
	
	{
		System.out.println("Calling from mobile");
	}

}
