package collection;

import java.util.HashSet;

public class HashSetDemo3
{

	public static void main(String[] args)
	{  
		//Union,Intersection,Difference Operations on HashSet Objects.
		HashSet<Integer> Set1 =new HashSet<Integer>();
		Set1.add(4);
		Set1.add(5);
		Set1.add(6);
		Set1.add(7);
		Set1.add(8);
		
		System.out.println("Set1" +Set1);
		
		HashSet<Integer> Set2 =new HashSet<Integer>();
		
		Set2.add(6);
		Set2.add(7);
		Set2.add(8);
		
		System.out.println("Set2"+Set2);
		//UNION
        Set1.addAll(Set2);
        System.out.println("Union:"+Set1);
        //INTERSECTION
        Set1.retainAll(Set2);
        System.out.println("Intersection:"+Set1);
		//DIFFERENCE -- It returns uncommon elements between two Hash Set objects.
        Set1.removeAll(Set2);
        System.out.println("Difference" +Set1);
		//SUBSET - Returns true or false, based on Set2 is a subset of Set2 or not
		System.out.println(Set1.containsAll(Set2));
	}

}
