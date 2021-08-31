package collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo2
{

	public static void main(String[] args)
	{
		
		HashSet hs =new HashSet();
		hs.add("Shankey");
		hs.add("Raja");
		hs.add(123);
		hs.add(true);
		hs.add(0.34);
		HashSet hs_copy =new HashSet();
		hs_copy.addAll(hs);
		System.out.println("Hs_Copy after adding from Hs"+hs);
		hs_copy.removeAll(hs);
		System.out.println("Hs_Copy after adding from Hs"+hs_copy);
		System.out.println("This is HS"+hs);
		
		
	}

}
