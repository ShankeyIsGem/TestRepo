package javaprogrames;

import java.util.Scanner;

public class SwappingNumbers
{

	public static void main(String[] args)
	{
		Scanner sr =new Scanner(System.in);
		System.out.println("First Number");
		int x=sr.nextInt();
		System.out.println("Second Number");
		int y=sr.nextInt();
		System.out.println("Numbers before Swapping "+"X ="+x +" and Y = "+y);

        x=x+y;
        y=x-y;
        x=x-y;
		System.out.println("Numbers after Swapping "+"X ="+x +" and Y = "+y);
	}

}
