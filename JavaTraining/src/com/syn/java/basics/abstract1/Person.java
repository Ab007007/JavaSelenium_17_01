package com.syn.java.basics.abstract1;

public class Person extends WhiteCar
{
	String name;
	int age;
	double height;
	double weight;
	static final String country = "India";
	
	public static void main(String[] args) 
	{
		Person p1 = new Person();
		Person p2 = new Person();
		Person p3 = new Person();
		Person p4 = new Person();
		Person p5 = new Person();
		
		p1.printColor();
		
		System.out.println("end");
	}
	


}
