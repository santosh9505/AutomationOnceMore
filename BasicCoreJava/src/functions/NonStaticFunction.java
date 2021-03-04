package functions;

public class NonStaticFunction {

	public static void main(String[] args) {
		
		NonStaticFunction ref = new NonStaticFunction();
		
		int sum = ref.sum(10,20);
		
		System.out.println(sum);
	}
	
	public int sum(int a, int b)
	{
		return a+b;
	}
	// Thumb rule : Static functions can only call static members of a class (variables,methods)
	//Thumb rule : to call non static functions/variables inside a static function , you need to create an object

}
