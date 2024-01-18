package com.syn.java.basics.exceptions;

public class ExceptionHandling 
{
	
	
	public static void main(String[] args) 
	{
		System.out.println("--- main started ---");
		try 
		{
			Thread.sleep(5000);
		}
		catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("--- main ended ---");
		
	}

}
