package com.Question2;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapForNum {

	public static void main(String[] args) {
		TreeMap<Integer,Integer> map=new TreeMap<>();
		for(int i=1;i<=20;i++)
	    {
		map.put(i,i*i);
	    }
	    for(Map.Entry e:map.entrySet()) 
	    {
	    	System.out.println(e.getKey()+" "+e.getValue());
	    	
	    }
	    TreeMap<Integer,Integer> map1=new TreeMap<>();
	    System.out.println("-----------------------");
	    map1.putAll(map);
	    System.out.println(map1);
	    System.out.println("------------------------");
	    System.out.println("To search for a specific key:"+map.containsKey(7));
	    System.out.println("To search for a specific value in key:"+map.containsValue(9));
	    System.out.println("-------------------------");
	    System.out.println("To find greatest key"+map.higherKey(19));
	    System.out.println(map.pollLastEntry());
	    System.out.println(map);
		

	}

}