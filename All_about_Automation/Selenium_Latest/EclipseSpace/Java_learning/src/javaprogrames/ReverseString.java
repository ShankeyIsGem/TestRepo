package javaprogrames;

import java.util.Scanner;

public class ReverseString
{

	public static void main(String[] args)
	{
		
        Scanner sr = new Scanner(System.in);
        System.out.println("Enter your String");
        String str=sr.next();
        int len =str.length();
         String rev= "";
        for (int i=len-1;i>=0;i--)
        {
        	rev = rev+str.charAt(i);
        }
        System.out.println(rev);
	}
	 

}
