package com.syn.java.basics.strings;

public class StringFunctions 
{
	static String email = "aru03.info@gmail.com";
	public static void main(String[] args) 
	{
		// Char at a given index
		System.out.println("Char at Index 0 : " + email.charAt(0));
		
//		// Char at a given index which does not exist
//		System.out.println("Char at Index 0 : " + email.charAt(100));
				
		
		// find the second occurance of a
		System.out.println("Second occurence of a : " + email.indexOf('a', email.indexOf('a')+1));
				
		// Index of a given char
		System.out.println("Index of @ in a given string  " + email.indexOf('@'));
		
		// Index of a non existing char
		System.out.println("Index of # in a given string  " + email.indexOf('#'));
		
		// Extract only user info from the email
		
		String[] details = email.split("@");
		
		System.out.println("User details from email " + details[0]);
		System.out.println("Domain details from email " + details[1]);
		
		
		// Last index of a char
		System.out.println("LastIndex of `a` in a given string  " + email.lastIndexOf('a'));
		
		System.out.println("Sub string : " + email.substring(email.indexOf('.')+1));
		
		
		System.out.println("Sub string to featch user : " +email.substring(0, email.indexOf('.')));
		
		
		
		//length of the string
		System.out.println("Length of the String : " + email.length());
		
		System.out.println(email.toCharArray());
		
		
	}

}
