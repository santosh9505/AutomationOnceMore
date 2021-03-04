package conditionalStatements;

public class LogicalOperator {
	public static void main(String[] args) {
		
		int a= 10;
		int b=20;
		int c=30;
		
		if(a>b && a>c)
		{
			System.out.println("a is greatest");
		}else if (b>a && b>c)
		{
			System.out.println("b is greatest");
		}else {
			System.out.println("c is greatest");
		}
		
		
		//OR
		
		int state = 81;
		int iit = 30;
		if (state>=80 || iit>=50) 
		{
	System.out.println("candidate is eligible");
	}
	
	}
}
