package com.syn.java.basics.constructors;


public class Person 
{
	String name;
	int age;
	double height;
	double weight;
	static final String country = "India";
	
	public String toString() {
		
		String str = "Object has, \nName : " + this.name  + "\nAge : " + this.age
				+ "\nHeight : " + this.height + "\nWeight : " + this.weight + "\nCountry : " + Person.country ;
		
		return str;
		
	}
	
	
	
	public Person() {
		System.out.println("constructor is called!!!");
	}
	
	
	public Person(String name, int age, double height, double weight)
	{
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		
	}
	
	
	public static void main(String[] args) 
	{
		System.out.println("Creating person class object");
		Person p1 = new Person();
		System.out.println("Created person class object");
		p1.name = "Aravinda";
		p1.age = 42;
		p1.height = 5.8;
		p1.weight =74;
		Person p2 = new Person("Harry", 41, 4.8, 66); 
		Person p3 = new Person("Niri", 35, 5.9, 80); 
		Person p4 = new Person("Abhi", 29, 5.8, 66); 

		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(p4);
		
		System.out.println("end");
	}
	


}
