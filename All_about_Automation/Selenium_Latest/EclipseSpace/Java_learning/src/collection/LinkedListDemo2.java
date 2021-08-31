package collection;

import java.util.Collections;
import java.util.LinkedList;



public class LinkedListDemo2
{

	public static void main(String[] args)
	{
       LinkedList ll =new LinkedList();
       ll.add("X");
       ll.add("Y");
       ll.add("Z");
       ll.add("A");
       ll.add("B");
       ll.add("C");
       LinkedList ll_copy =new LinkedList();
       //To copy all elements from ll to ll_copy
       ll_copy.addAll(ll);
       System.out.println(ll_copy);
       //To Remove all elements from 'll_copy' which were added via 'll'
       ll_copy.removeAll(ll);
       ll_copy.add("Copy One");//This would still display for 'll_copy'
       System.out.println(ll);
       System.out.println(ll_copy);
       // For sorting/Shuffle operation collections class is used.
       Collections.sort(ll);// To sort in ascending order.
       System.out.println(ll);
       Collections.shuffle(ll);
       System.out.println(ll);
       Collections.sort(ll, Collections.reverseOrder()); //To Sort in descending order.
       System.out.println(ll);

	}

}
