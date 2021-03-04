package practice;

public class Practice4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String an = "anjali";
		char te = 'a';
		int count = 0;
		
		for (int i = 0; i <an.length(); i++)
		{
			if (te == an.charAt(i))
			{
				count++;
			}
		}
		System.out.println(te +" is present " + count);

	}

}
