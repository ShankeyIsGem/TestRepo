package javaprogrames;

import java.util.Scanner;

public class CompareTwoNumbers
{

	public static void main(String[] args)
	{
	   Scanner sr =new Scanner(System.in);
	   System.out.println("Enter your First Number");
	   int num1 = sr.nextInt();
	   System.out.println("Enter your Second Number");
	   int num2 = sr.nextInt();
	   if (num1 == num2)
	   {
		   System.out.println("Numbers are matching");
		   
	   }else {
		   System.out.println("Numbers are not matching");
	   }
	 

	}

}
