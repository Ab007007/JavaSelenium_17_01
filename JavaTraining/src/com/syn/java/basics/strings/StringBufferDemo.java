package com.syn.java.basics.strings;

public class StringBufferDemo 
{
	static String eamil = "aru03.info@gmail.com";
	
	
	public static void main(String[] args) 
	{
		StringBuffer sb = new StringBuffer(eamil);
		printString(sb);
	
		sb.append(";age=55");
		printString(sb);
		
		sb.append(";Qualification=MTech");
		printString(sb);
		
		System.out.println("Char at Index 0 : " + sb.charAt(0));
		
//		// Char at a given index which does not exist
//		System.out.println("Char at Index 0 : " + sb.charAt(100));
				
		
		// find the second occurance of a
		System.out.println("Second occurence of a : " + sb.indexOf("a", sb.indexOf("a")+1));
				
		// Index of a given char
		System.out.println("Index of @ in a given string  " + sb.indexOf("@"));
		
		// Index of a non existing char
		System.out.println("Index of # in a given string  " + sb.indexOf("#"));
		
		
		// Last index of a char
		System.out.println("LastIndex of `a` in a given string  " + sb.lastIndexOf("a"));
		
		System.out.println("Sub string : " + sb.substring(sb.indexOf(".")+1));
		
		
		System.out.println("Sub string to featch user : " +sb.substring(0, sb.indexOf(".")));
		
		
		
		//length of the string
		System.out.println("Length of the String : " + sb.length());
		
		System.out.println("Reverse of string : " + sb.reverse());
		
		System.out.println("Reverse of string : " + sb.reverse());
		
		System.out.println("Insert a string : " + sb.insert(0, "email="));
		
		System.out.println("replace a string : " +  sb.replace(sb.indexOf("@")+1, sb.indexOf(".com"), "yahoo"));
		
		
	}
	
	
	private static void printString(StringBuffer sb)
	{
		System.out.println("-------------------------------------------");
		System.out.println("Content of the string : " + sb);
		System.out.println("Address of the string : " + sb.hashCode());
	}

}
