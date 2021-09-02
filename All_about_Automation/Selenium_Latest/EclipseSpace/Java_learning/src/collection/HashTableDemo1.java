package collection;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashTableDemo1
{

	public static void main(String[] args)
	{
		//Hashtable t=new Hashtable();//Capacity 11 and load factor 0.75
		//Hashtable t =new Hashtable(12);//User Defined capacity =12
		//Hashtable t=new Hashtable(15,(float) 0.95);//User Defined capacity =15, Load factor=0.95
		Hashtable <Integer, String> t =new Hashtable<Integer, String>();
		
		//Adding values to HashTable Object
		t.put(101, "Shankey");
		t.put(102, "Raja");
		t.put(103, "Tyagi");
		t.put(104, "Lalak");
		t.put(105, "Don");
		//t.put(null, "khat");//NullPointerException
		//t.put(106, null);//NUll is not allowed in hash map and after executing - NullPointerException
		
		System.out.println(t);
		
		//To print key specific value.
		System.out.println(t.get(101));
		
		//To remove key specific value.
		t.remove(101);
		System.out.println(t);
		
		////True/False - Based on Key exist or not.
		System.out.println(t.containsKey(102));//True
		System.out.println(t.containsKey(106));//False
		
		//True/False - Based on value exist or not.
		System.out.println(t.containsValue("Raja"));//True
		System.out.println(t.containsValue("ABCD"));//True
		
		//To check if HashTable object is empty or not.
		System.out.println(t.isEmpty());
		
		//To Return all keys
		System.out.println(t.keySet());
		
		//To Return all values
		System.out.println(t.values());
		
		//To retrieve key and values using loop
		for (int i:t.keySet())
		{
			System.out.println(i+"   "+t.get(i));
		}
		
		//Entry Specific methods.....
		
		for (Map.Entry entry:t.entrySet())
		{
			System.out.println(entry.getKey()+"  "+entry.getValue());
		}
		
		//Iterator()
		Set s=t.entrySet();
		
	   Iterator itr	=s.iterator();
	   
	   while(itr.hasNext())
	   {
		  Map.Entry entry=(Entry) itr.next();
		  System.out.println(entry.getKey()+"  "+entry.getValue());
	   }
		   
		
		
		
		
		
	}

}
