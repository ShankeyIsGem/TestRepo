package collection;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo1
{

	public static void main(String[] args)
	{
//		LinkedHashSet lset =new LinkedHashSet();
//		LinkedHashSet<Integer> lset1 =new LinkedHashSet<Integer>();
		LinkedHashSet lset =new LinkedHashSet();
		lset.add("Shankey");
		//Duplicated would be alllowed but not be printed in final result
		lset.add("Shankey");
		lset.add(123);
		lset.add(2.5);
		lset.add('a');
		lset.add(null);
		lset.add(true);
		lset.add(123);
		System.out.println(lset); //[Shankey, 123, 2.5, a, null, true]
		
	}

}
