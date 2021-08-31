package collection;

import java.util.Iterator;
import java.util.LinkedList;



public class LinkedListDemo1
{

	public static void main(String[] args)
	{
//    Ways to declare linked list -- 
//    1. LinkedList l1 =new LinkedList();
//    2. LinkedList <String> l2 = new LinkedList<String>();
      
		LinkedList l1 =new LinkedList();
		//Adding elements to Linked list
		l1.add("This");
		l1.add(1234);
		l1.add('A');
		l1.add(7.5);
		l1.add(true);
		l1.add(null);
		System.out.println(l1);
		//Getting specific element from Linked List.
		System.out.println(l1.get(3));
		//Removing specific element from Linked List.
		System.out.println(l1.remove(2));
		System.out.println("After removing specific element" +l1);
		//Replace existing value with new one.
		System.out.println(l1.set(0, "Replaced"));
		System.out.println("After Replacing" +l1);
		//Returns true or false based on element exist or not.
		System.out.println(l1.contains("This"));
		System.out.println(l1.contains("Replaced"));
		//Returns true or false based if LL is empty or not
		System.out.println(l1.isEmpty());

		// Iterating through LL elements
		//1. Using for loop
		for (int i=0;i<l1.size();i++)
		{
			System.out.println(l1.get(i));
		}
		//2. using for each loop
		for (Object e : l1)
		{
			System.out.println(e);
		}
		//3. Using Iterator method
		Iterator itr=l1.iterator();
		while (itr.hasNext())
		{
			System.out.println(itr.next());
		}
		

	}

}
