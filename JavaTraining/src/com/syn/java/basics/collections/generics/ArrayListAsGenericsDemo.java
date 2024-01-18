package com.syn.java.basics.collections.generics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.syn.java.basics.constructors.Person;


public class ArrayListAsGenericsDemo 
{

	public static void main(String[] args) 
	{
		List<Person> al = new ArrayList<Person>();
		
		
		al.add(new Person("a1", 22, 5.5, 55.5));
		al.add(new Person("a2", 22, 5.5, 55.5));
		al.add(new Person("a3", 22, 5.5, 55.5));
		al.add(new Person("a4", 22, 5.5, 55.5));
		al.add(new Person("a5", 22, 5.5, 55.5));
		
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
