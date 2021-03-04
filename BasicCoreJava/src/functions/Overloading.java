package functions;

public class Overloading {

	public static void main(String[] args) {
		
		sum(10,20);
		
	}
	
	public static void sum(int a, int b)
	{
		System.out.println(a+b);
	}
	
	public static void sum(int a , int b , int c)
	{
		System.out.println(a+b+c);
	}

	// Method overloading : same method name with different parameters
	// Different parameters:
	//1. increase the parameters
	//2. decrease the parameters
	//3. swap the parameters
	//4. change the datatype
	
// To achieve Method overloading . we will have to compulsory change the parameters irrespective of any changes in the functions
	
	
}
