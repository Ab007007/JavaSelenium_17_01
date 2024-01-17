package com.syn.java.basics.methods;

public class MethodOverriding 
{
	/*
	 * tostring() is a method from Object class and we are overriding 
	 * tostirng()  method and giving new implementation
	 *  
	 */
	public String toString() {
	
		String str = "Object has, \nName : " + this.name  + "\nAge : " + this.age
				+ "\nHeight : " + this.height + "\nWeight : " + this.weight + "\nCountry : " + MethodOverriding.country + 
				"\n*****************************************************";
		
		return str;
		
	}
	
	String name;
	int age;
	double height;
	double weight;
	static final String country = "India";
	
	public static void main(String[] args) 
	{
		MethodOverriding p1 = new MethodOverriding();
		p1.name = "Aravinda";
		p1.age = 42;
		p1.height = 5.8;
		p1.weight =74;
	
		System.out.println(p1);
		
		
		MethodOverriding p2 = new MethodOverriding();
		System.out.println(p2);
		
		System.out.println("end");
	}
	


}
