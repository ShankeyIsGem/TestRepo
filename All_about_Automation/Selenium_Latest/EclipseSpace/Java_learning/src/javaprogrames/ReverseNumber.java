package javaprogrames;

import java.util.Scanner;

public class ReverseNumber
{

	public static void main(String[] args)
	{
		Scanner sr = new Scanner(System.in);
	    System.out.println("Enter Your number");
		int num =sr.nextInt();
		int rev =0;
		while (num!=0)
		{
			rev=rev*10+num%10;
			num =num/10;
		}
		System.out.println("Reversed Number " +rev);
	}

}
