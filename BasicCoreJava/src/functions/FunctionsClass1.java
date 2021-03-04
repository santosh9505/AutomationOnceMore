package functions;

public class FunctionsClass1 {

	public static void main(String[] args) {
		
		/*
		 * int a=10; int b=20;
		 * 
		 * System.out.println(a+b);
		 * 
		 * int c=10; int d=20;
		 * 
		 * System.out.println(c+d);
		 * 
		 * int e=10; int f=20;
		 * 
		 * System.out.println(e+f);
		 */

		sum(10,20);
		sum(30,40);
		sum(50,60);
		name("sankalp", 1);
	}
	
	// Access Modifier //Type of Function // Return Type // name   // Parameters
	public               static               void          sum      (int a, int b)
	{
		System.out.println(a+b);
	}

	public static void name( String s , int age)
	{
		System.out.println("Your name is :"+ " " +s  + " " + "and age is " + age );
	}
}
