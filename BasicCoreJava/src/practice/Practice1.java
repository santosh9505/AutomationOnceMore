package practice;

public class Practice1 {

	public static void main(String[] args) {
		
		
		System.out.println("Question 1 : Program to print even numbers from 1 to 100 with for loop");
		
		for (int i = 1; i<=100 ; i++)
		{
			if (i%2 == 0) 
			{
				System.out.print(i + " " );
			}
		}
		System.out.println();
		System.out.println("*******************************************************************");
		System.out.println("Question 2 : for loop which prints numbers from 1 to 100 but if the number is divisible by 5, it prints 'divisble by 5 followed by that number");
		
		for (int i = 1; i<=100 ; i++)
		{
			if (i%5 ==0)
			{
				System.out.print( "The next number is divisible by 5: ");
			}
			System.out.println(i);
		}
		
		System.out.println("*******************************************************************");
		System.out.println("Question 3 : Write a for loop to find the sum of first 100 numbers(1 to 100)");
		
	int sum = 0;
	for (int i = 1; i<= 100; i++ )
	{
		sum = sum+i;
	}
	System.out.println(sum);
	System.out.println("*******************************************************************");
		
	System.out.println("New Question");
	
	for (int i =1; i<8 ; i++) 
	{
		for (int j = 1; j<i ; j++) 
		{
			System.out.print(j);
		}
		System.out.println();
	}
	
	System.out.println("*******************************************************************");
	
	System.out.println("Make an integer array. Write a for loop to print the integer array in reverse.");
	int arr[] = {2,3,5,6,7,8,9};
	
	for (int i = arr.length-1; i>=0;i--)
	{
		System.out.print(arr[i] + ",");
	}
	System.out.println();
	
System.out.println("*******************************************************************");

System.out.println("Print alternate elements of String array array");

String arr1[] = {"Iam","it","trying",",is","to","learn","practice"};
	
	for (int j = 0; j<=arr1.length-1; j+=2)
	{
		System.out.print(arr1[j] +" ");
	}
	
	
	System.out.println("*******************************************************************");

	System.out.println("Find the greatest number in a array");
	int arr2[] = {5,3,5,6,1,8,9,1};
	int temp = 0;
	for (int i = 0;i<arr2.length;i++) {
		if(temp<arr2 [i])
		{
			temp = arr2[i];
		}
	}
	System.out.println(temp);
	
	System.out.println("*******************************************************************");

	System.out.println("Find the least number in a array");
	int arr3[] = {5,3,5,6,1,8,9,1};
	int temp1 = 5;
	for (int i = 0;i<arr2.length;i++) {
		if(temp1>arr2 [i])
		{
			temp1 = arr2[i];
		}
	}
	System.out.println(temp1);
	
}
	

	}
