package expections;

import oops.inheritance.Telephone;

public class TryCatchblock {
	
	static Telephone phone;

	public static void main(String[] args) {
try {
		
		// Arithmetic Exception
	       System.out.println(10/0); //Arithmetic exception
			
} catch(ArithmeticException e)
{
	e.printStackTrace();
	System.out.println(e.getMessage());
}
			 //StringIndexOutOfBoundException
	         String name = "anand"; // 
	        System.out.println(name.charAt(6)); //String index out of range: 6
			
			//ArrayIndexOutofBoundsException
			int[] arr = {10,20,30};
			System.out.println(arr[4]);
			
			//NullPointerException
			phone.calling();


	}

}
