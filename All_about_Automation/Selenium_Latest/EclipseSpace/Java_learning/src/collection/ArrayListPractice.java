package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListPractice
{

	public static void main(String[] args)
	{   
		// Specific Types declaration 
		// ArrayList <String> al1 =new ArrayList <String>();
		// varying objects types
		ArrayList al=new ArrayList();
		//adding values to array list
		al.add(1234);
		al.add("Shankey");
		al.add("Shankey");
		al.add('s');
		al.add(12.5);
		System.out.println(al);
		//Removed based on index or actual element
		al.remove(0);
		al.remove(12.5);
		//Returns true or false based on given value is found or not.
		System.out.println(al.contains("Shankey"));
		//Returns size of array list
		System.out.println(al.size());
		//Replace Element
		al.set(0, "NewVal");
		//Insert new element - Existing element would be shifted to the right.
		al.add(0, "Raja");
		System.out.println(al.isEmpty());
		
		System.out.println("Reading elements using for loop");
		//1.Using for loop
		System.out.println("Using for loop ->");
		for (int i=0;i<=al.size()-1;i++)
		{
			System.out.println(al.get(i));
		}
		
		//2. Using for ...each loop
		System.out.println("Using for each loop ->");
		for (Object i:al)
		{
			System.out.println(i);
			
		}
		
		System.out.println("Using Iterator ->");
		Iterator itr=al.iterator(); //Iterable is parent interface of collection interface 
		while (itr.hasNext())
		{ 
			System.out.println(itr.next());
			
		}

	}

}
