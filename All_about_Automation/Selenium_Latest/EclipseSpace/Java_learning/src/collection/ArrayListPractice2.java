package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListPractice2
{

	public static void main(String[] args)
	{   
		ArrayList al =new ArrayList();
		al.add("X");
		al.add("Y");
		al.add("Z");
		al.add("A");
		al.add("B");
		al.add("C");
		ArrayList al_dup =new ArrayList();
		al_dup.addAll(al);//To copy all objects from collection 'al' to 'al_dup'
		System.out.println(al_dup);
		al_dup.removeAll(al);//It will delete all objects from 'al_dup' and not from 'al'
		System.out.println("After Removing" +al_dup);
		System.out.println("Elements in array list al:" +al);
		Collections.sort(al);//To sort elements from arraylist.
		System.out.println("Sorted array list" +al);
		Collections.sort(al,Collections.reverseOrder());
		System.out.println("Sorted arraylist elements in Reve	rse order" +al);
		Collections.shuffle(al);//To shuffle in random order
		System.out.println("Arraylist elements after shuffling in random order" +al);
		
	}

}
