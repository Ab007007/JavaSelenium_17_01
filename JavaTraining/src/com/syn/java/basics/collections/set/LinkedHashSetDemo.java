package com.syn.java.basics.collections.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class LinkedHashSetDemo 
{

	public static void main(String[] args) 
	{

		Set s = new LinkedHashSet();
		
		s.add("ABC");
		s.add(123);
		s.add(88.88);
		
		s.add("ABC");
		s.add(123);
		s.add(88.88);
		
		System.out.println("Total Elements in Set " + s.size());
	
		printCollection(s);
	}
	
	
	private static void printCollection(Set al) {
		System.out.println("----------------------------------------------");
		System.out.println("Total elements in collection " + al.size());
		
		Iterator it = al.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
	
}
