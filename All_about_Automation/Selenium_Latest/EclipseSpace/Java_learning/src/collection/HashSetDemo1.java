package collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo1
{

	public static void main(String[] args)
	{
		//HashSet hs =new HashSet();//Default size =10, Load Factor =0.75
		//HashSet hs =new HashSet(100);//Size =100, Load Factor =0.75
		//HashSet hs =new HashSet(100, (float)0.90);//Size =100, Load Factor =90%
		
		HashSet hs =new HashSet();
		hs.add("Shankey");
		hs.add("Raja");
		hs.add(123);
		hs.add(true);
		hs.add(0.34);
		System.out.println(hs);//[0.34, T, Shankey, 123, true] -- Insertion order not preserved.
		hs.remove('T');//Index based removal is not supported in hash set.
		System.out.println(hs);
		//contains
		System.out.println(hs.contains("Shankey"));
		System.out.println(hs.isEmpty());
		
		//1. Retrieval through For...each loop
		//For loop is not possible because Get method is not supported in Hash Set.
		for (Object e :hs)
		{
			System.out.println(e);
		}
		
		//2. Retrieval through Iterator
			Iterator itr	=hs.iterator();
			while (itr.hasNext())
			{
			  System.out.println(itr.next());
			}
				
	}

}
