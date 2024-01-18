package com.syn.java.basics.strings;

public class StringDemo 
{
	
	
	public static void main(String[] args) 
	{
		
		String name = "Aravinda";
		String user_details = new String();
		
		System.out.println(user_details);
		System.out.println("Address : " + user_details.hashCode());
		
		user_details = user_details.concat("Name:Aravinda;");
		System.out.println(user_details);
		System.out.println("Address : " + user_details.hashCode());
		
		user_details = user_details.concat("Age:45;");
		System.out.println(user_details);
		System.out.println("Address : " + user_details.hashCode());
		
		user_details = user_details.concat("Qualification:MTech");
		System.out.println(user_details);
		System.out.println("Address : " + user_details.hashCode());
		
		
	}

}
