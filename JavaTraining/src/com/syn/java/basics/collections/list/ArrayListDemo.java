package com.syn.java.basics.collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.syn.java.basics.variables.Person;

public class ArrayListDemo 
{

	public static void main(String[] args) 
	{
		List al = new ArrayList();
		List al1 = new ArrayList();
		
		al.add(25);
		al.add(23.3);
		al.add("abcd");
		al.add(new Person());
		al.add(al1);
		
		printCollectionUsingForloop(al);
		
		al.add(0, "new element");
		printCollectionUsingForloop(al);
		
		al.remove("new element");
		printCollectionUsingForloop(al);
		
	
	}

	private static void printCollection(List al) {
		System.out.println("----------------------------------------------");
		System.out.println("Total elements in collection " + al.size());
		
		Iterator it = al.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
	
	
	
	private static void printCollectionUsingForloop(List al) {
		System.out.println("----------------------------------------------");
		System.out.println("Total elements in collection " + al.size());
		for (int i = 0; i < al.size(); i++) 
		{
			System.out.println("Element at index " + i + " is " +  al.get(i));
		}
	}
}
