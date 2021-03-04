package functions;

public class Practice1 {

	public static void main(String[] args) {
		
		//boolean b = eligibilty(50,40);
		//result(b);
		
		boolean c = eligibilty(20,false);
		result(c);
		
	}
/*
	public static boolean eligibilty (int a, int b)
	{
		if (a >=80 || b>=50)
		{
			return true;
	     
	}
		
		else {
			return false;
		}
	}
	*/
	public static boolean eligibilty (int a, boolean b)
	{
		if (a >=21|| b == true)
		{
			return true;
	     
	}
		
		else {
			return false;
		}
	}
	
	public static void  result(boolean eligible)
	{
		if (eligible)
		{
			System.out.println("Your eligible");
		}
		else 
		{
			System.out.println("Your not eligible");
		}
	}
}

