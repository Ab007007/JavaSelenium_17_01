package com.syn.java.basics.exceptions;

public class ThrowsDemo
{
	
	public static void main(String[] args) {
		System.out.println("--- main started ----");
		try {
			wait(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("--- main ended ----");
	}
	
	
	public static void wait(int ms) throws InterruptedException
	{
		System.out.println("Waiting for " + ms + " mili seconds");
		Thread.sleep(ms);
		System.out.println("Waiting complete for " + ms + " mili seconds");
		
	}

}
