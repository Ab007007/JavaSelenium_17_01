package com.syn.java.basics.strings;

import java.util.Scanner;

public class StringReverse
{
	
	
	public static void main(String[] args) 
	{
//		StringFunctions.email
		System.out.println("Enter the string to be reversed!!!");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
		String[] words = input.split(" ");
		
		System.out.println("Given String : " + input);
		for (int i = 0; i < words.length; i++) 
		{
			reverseString(words[i]);
		}
		
	}

	private static void reverseString(String str) 
	{
		
		
		for (int i = str.length()-1; i >=0 ; i--) 
		{
			System.out.print(str.charAt(i));
		}
		System.out.print(' ');
	}

}
