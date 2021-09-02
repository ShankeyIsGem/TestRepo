package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo1
{

	public static void main(String[] args)
	{   HashMap <Integer, String> m =new HashMap<Integer, String>();
		//HashMap m =new HashMap();
		
		//Adding elements to hashMap Object
		m.put(101, "Shankey");
		m.put(102, "Tyagi");
		m.put(103, "Harsh");
		m.put(104, "Nainish");
		m.put(105, "Arwi");
		
		//Print value of hashmap object
		System.out.println(m);//{101=Shankey, 102=Tyagi, 103=Harsh, 104=Nainish, 105=Arwi}
		
		//To get specific key value.
		System.out.println(m.get(101));
		
		//To remove specific entry based on key
		m.remove(105);//{101=Shankey, 102=Tyagi, 103=Harsh, 104=Nainish}
		System.out.println(m);
		
		//To check if specific key exist or not.
		System.out.println(m.containsKey(101));//True
		System.out.println(m.containsKey(105));//False
		
		//To check if specific value exist or not. (True/False)
		System.out.println(m.containsValue("Shankey"));//True
		System.out.println(m.containsValue("Nana"));//False
		
	   //To check if Hash Map is empty or not.
		System.out.println(m.isEmpty());//False
		
		// To return all keys of hashmap object.
		System.out.println(m.keySet());//Return all values as Set
		
		//To return all values against the hashmap object.
		System.out.println(m.values());
		
		//To return all entries as set object
		System.out.println(m.entrySet());
		
		//To get all the keys
		for (Object i:m.keySet())
		{
			System.out.println(i);
		}
		
		// To get all the values
		for (Object i:m.values())
		{
			System.out.println(i);
		}
		
		//To get all Keys against the values
		for (Object i:m.keySet())
		{
			System.out.println(i+"    "+m.get(i));
		}
		
		//Entry Methods
		
		for (Map.Entry entry:m.entrySet())
		{
			System.out.println(entry.getKey()+"  "+entry.getValue());
			
		}
		
		//Using Iterator
		Set s=m.entrySet();
		Iterator itr=s.iterator();
		while(itr.hasNext())
		{
			//System.out.println(itr.next());
			Map.Entry entry=(Entry) itr.next();
			System.out.println(entry.getKey()+ "   "+entry.getValue());
			
		}
	}

}
