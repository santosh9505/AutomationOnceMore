package functions;

public class ReturnType {

	public static void main(String[] args) {
		
          int var1=sum(10,20); // as the function's return type is int , we can store that value to a variable
          System.out.println(var1);
          
          int var2=sum(30,40);
          System.out.println(var1 + var2);
          
          int sum1=sum(10,20);
          int sum2=sum(30,40);
          
          System.out.println(sum(sum1,sum2));
          
          
	}

	public static int sum(int a, int b) // function can return only one type of value // can return array also
	{
		return a+b;
	}
	
	public void message(String message)
	{
		System.out.println(message);
	}
		
	
}
     //Assignment 1: create function for eligiblility (CET >=80,IIT= 50>=)
	// Assignment2 :  param = boolean, on true = "you are eligible" on false = "you are not eligible"
   // Assignment 3: Create an eligibility function which will accept (age,marrital Status)
  // if age >= 21, marrital Status = true