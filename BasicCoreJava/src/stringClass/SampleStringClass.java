package stringClass;

public class SampleStringClass {

	public static void main(String[] args) {
		
		
//		String name = "Anand";
//		
//		//Function 1
//		System.out.println(name.length());
//		
//		//Function 2
//		System.out.println(name.charAt(4));
//		
//		//Function 3
//		System.out.println(name.toUpperCase());
//		
//		//Function 4
//		System.out.println(name.toLowerCase());
//		
//		//Function 5
//		System.out.println(name.trim());
//		
//		//Function 6
//		System.out.println(name.replace("n","1"));
		
		//Split
		String temp = "Hi my name is Anand";
		String[] str = temp.split(" "); // return type of Split is String array
		
		System.out.println(str.length);
		
		for(int i = 0; i<=19;i++)
		{
			System.out.println(str[i]);
		}
		
//		// Equals
//		System.out.println(name.equals(temp));
//		
//		//Equals Ignore case
//		System.out.println(name.equalsIgnoreCase(temp));
//		
//		//sub string
//		System.out.println(temp.substring(4, 10));
//		System.out.println(temp.substring(14));
//		
		//anjali
		//Hi My name is Anand
		
		
		
		
	}

}
