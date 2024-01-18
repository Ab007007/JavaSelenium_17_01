package com.syn.java.basics.exceptions;

public class UnCheckedExceptions 
{
	public static void main(String[] args) 
	{
		try
		{
			System.out.println("--- main started ----");
			String str = null;
			System.out.println("Length : " + str.length());
			System.out.println(str.charAt(str.length()));
		}
		catch(StringIndexOutOfBoundsException ex)
		{
			System.out.println(ex.getMessage());
		}
		catch(NullPointerException ex)
		{
			System.out.println(ex.getMessage());
		}
		finally
		{
			System.out.println("[ FINALLY ]--- main ended ----");
		}
	}

}
