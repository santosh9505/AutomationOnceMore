package practice;

public class Practice5 {

	public static void main(String[] args) {

		String temp = "Hi my name is Anand";
		String[] str = temp.split(" ");
		String[] str2 = new String[str.length];
		for(int k=0; k<str2.length;k++)
		{
			str2[k] = "";
		}
		
		
		
		// return type of Split is String array
	    
		//System.out.println(str.length);
		for(int i = 0; i<str.length;i++)
		{
		String[] str3 = str[i].split("");
		for(int j = str3.length-1; j>=0; j--)
		{
			str2[i] = str2[i]+str3[j];
		}
			
		}
		for(String s: str2)
		{
			System.out.print(s+" ");
		}
		
//		for(int i = 0; i<str.length;i++)
//		{
//			 StringBuffer str1 = new StringBuffer(str[i]);
//			 //System.out.print(str1);
//			 System.out.print(str1.reverse() + " ");
//			
//		}
		
}
}
	
	
