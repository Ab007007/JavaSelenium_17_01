package com.syn.java.basics.collections.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo 
{

	public static void main(String[] args) 
	{
	
		//creating a object to map
		Map  mp = new TreeMap();
		
		
		//adding elements to map
		mp.put("name", "Aravinda");
		mp.put("age", 11);
		mp.put("qualification", "MTech");
		
		//Total elements in collection
		System.out.println(mp.size());
		
		
		//retrieve any element 
		System.out.println(mp.get("name"));
		
		Set keys = mp.keySet();
		String key = null;
		Iterator it = keys.iterator();
		while(it.hasNext())
		{
			
			key =  (String) it.next();
			System.out.println("Element for a key " + key + " is "  + mp.get(key));
		}
		
	}
}
