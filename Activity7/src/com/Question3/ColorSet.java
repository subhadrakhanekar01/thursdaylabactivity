package com.Question3;

import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;

public class ColorSet {

	public static void main(String[] args) {
		TreeSet<String> ts=new TreeSet<>();
		ts.add("Pink");				//adding elements in tree set
		ts.add("Blue");		
		ts.add("Red");
		ts.add("Purple");
		for(String s:ts)                 //does not maintain Insertion order
		{
			System.out.println(s);
			
		}
		System.out.println("-----------------------------");
		
		TreeSet<String> ts1=new TreeSet<>();
		ts1.addAll(ts);				//copying the element from 1st tree set to 2nd tree set
		Iterator<String> itr=ts1.descendingIterator();    //reversing the elements in the tree set
		while(itr.hasNext())
		{
			System.out.println(itr.next());	
		}
		System.out.println("-----------------------------");
		System.out.println(ts1.equals(ts));		//comparing the 1st tree set second tree set
		
		System.out.println("-------------------------------------");
		System.out.println("to get first element "+ts1.pollFirst());			
		System.out.println("To get Last element "+ts1.pollLast());		 //getting last element from the tree set
	

	}

}

