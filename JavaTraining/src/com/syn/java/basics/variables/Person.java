package com.syn.java.basics.variables;

public class Person 
{
	String name;
	int age;
	double height;
	double weight;
	static final String country = "India";
	
	public static void main(String[] args) 
	{
		Person p1 = new Person();
		p1.name = "Aravinda";
		p1.age = 42;
		p1.height = 5.8;
		p1.weight =74;
		System.out.println(p1);
		Person p2 = new Person();
		System.out.println(p2);
		
		System.out.println("end");
	}
	


}
