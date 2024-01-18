package com.syn.java.basics.collections.set;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo 
{

	public static void main(String[] args) 
	{

		Set s = new TreeSet();
		
		s.add(13);
		s.add(1323);
		s.add(323);
		s.add(23);
		s.add(3);
		s.add(1243);
		s.add(1235);
		
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
