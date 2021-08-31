package javaprogrames;

import java.util.Scanner;

public class EvenOddCheck
{

	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter your Nubmer");
		int num=sc.nextInt();
		System.out.println("Even Number between 1 and  " +num);
		
		for (int i=1;i<num;i++)
		{
			if (i%2==0)
			{
				System.out.println(i+ " This is Even");
			}
			else 
			{
				System.out.println(i +"Number is odd");
			}
		}
		            
	}

}
