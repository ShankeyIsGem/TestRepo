package collection;

import java.util.Iterator;
import java.util.PriorityQueue;

public class QueueDemo1
{

	public static void main(String[] args)
	{
		PriorityQueue pq =new PriorityQueue();
		//Add Elements using Add(), After() methods.
        pq.add("A");
        pq.add(123);//Hetrogenious would not be allowed and it will throw exception during Run Time.
        pq.add("B");
        pq.add("C");
        pq.add("C");
        pq.offer("D");
		System.out.println(pq);//[A, B, C, C, D] -> Insertion order preserved and duplicates are allowed.
		
		//get Head element element(), peek()
		System.out.println(pq.element());//Returns Head element, If empty then returns NoSuchElementException
		System.out.println(pq.peek());////Returns Head element, If empty then returns NULL
		
		//Return and Remove element from Queue remove() poll()
//        System.out.println(pq.remove());//It returns and removes the Head element, if  empty then returns NoSuchElementException
//        System.out.println(pq);
//		System.out.println(pq.poll());//It returns and removes the Head element, if empty then returns NULL.
//		System.out.println(pq);

		
		//To Get all elements from the Queue.
		Iterator itr =pq.iterator();
		while (itr.hasNext())
		{
			System.out.println(itr.next());
		}
		for (Object str:pq)
		{
			System.out.println(str);
		}
	}

}
