package collection;

import java.util.Iterator;
import java.util.LinkedList;

public class QueueDemo2
{

	public static void main(String[] args)
	{
		LinkedList ll =new LinkedList();
		ll.add("Shankey");
		ll.add("Shankey");
		ll.add('A');
		ll.add('B');
		ll.offer(123);//Hetrogeniuous would be allowed.
		System.out.println(ll);
		//To Get header element
		System.out.println(ll.element());
		System.out.println(ll.peek());
		//To return and remove header element
		System.out.println(ll.remove());
		System.out.println(ll);
		System.out.println(ll.poll());
		System.out.println(ll);
		//To Iterate through Queue Elements
		Iterator itr =ll.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	    for (Object e:ll)
	    {
		System.out.println(e);
	    }
	}

}
