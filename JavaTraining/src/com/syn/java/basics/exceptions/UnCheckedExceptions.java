package com.syn.java.basics.exceptions;

public class UnCheckedExceptions 
{
	public static void main(String[] args) 
	{
		System.out.println("--- main started ----");
		String str ="abc";
		System.out.println("Length : " + str.length());
		try
		{
			System.out.println(str.charAt(str.length()));
		}
		catch(StringIndexOutOfBoundsException ex)
		{
			System.out.println(ex.getMessage());
		}
		System.out.println("--- main ended ----");
		
	}

}
