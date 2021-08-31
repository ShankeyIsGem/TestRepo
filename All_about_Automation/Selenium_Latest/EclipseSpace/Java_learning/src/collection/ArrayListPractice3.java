package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListPractice3
{

	public static void main(String[] args)
	{   
		String arr[] = {"Shankey", "Raja", "Nainish"};
		for (String s1:arr)
		{
			System.out.println(s1);
		}
		ArrayList al =new ArrayList(Arrays.asList(arr));//To Convert array into arraylist.
		System.out.println(al);
		
		
		
		
	}

}
