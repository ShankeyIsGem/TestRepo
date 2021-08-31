package collection;

import java.util.Collections;
import java.util.LinkedList;



public class LinkedListDemo3
{

	public static void main(String[] args)
	{
       LinkedList ll =new LinkedList();
       ll.add("Shankey");
       ll.add("Tyagi");
       ll.add("Raja");
       ll.add("Naininsh");
       ll.add("Foji");
       System.out.println(ll);
     //To add element at first location in LL
       ll.addFirst("F");
     //To add element at last location in LL
       ll.addLast("L");
       System.out.println(ll);
     //To retrieve element at first location in LL
       System.out.println(ll.getFirst());
       //To retrieve element at last location in LL
       System.out.println(ll.getLast());
       //To remove element at first location in LL
       ll.removeFirst();
       //To retrieve element at last location in LL
       ll.removeLast();
       System.out.println(ll);
	}

}
