package loops;

public class EnchancedForLoop {

	public static void main(String[] args) {
		
		
		String[] arr = new String[3];
		
		arr[0] = "Anjali";
		arr[1] = "Subhangi";
		arr[2] = "Santosh";
		
		for(int i=0; i<3; i++)
		{
			System.out.println(arr[i]);
		}
		
		System.out.println("*****************");
		
		for(String s: arr)
		{
			System.out.println(s);
		}
		
int[] array = new int[3];
		
		array[0] = 10;
		array[1] = 20;
		array[2] = 30;
		
		for(int i: array)
		{
			System.out.println(i);
		}

	}

}
