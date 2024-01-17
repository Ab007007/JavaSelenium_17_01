package com.syn.java.basics.access.pack1;

public class A 
{
	
	private int privateVariable = 10;
	int defaultVariable = 20;
	protected int protectedVariable = 30;
	public int publicVariable = 40;
	
	
	
	private void privateFunction()
	{
		System.out.println("---------------------------------------------");
		System.out.println(privateVariable);
		System.out.println(defaultVariable);
		System.out.println(protectedVariable);
		System.out.println(publicVariable);
	}
	
	void defaultFunction()
	{
		System.out.println("---------------------------------------------");
		System.out.println(privateVariable);
		System.out.println(defaultVariable);
		System.out.println(protectedVariable);
		System.out.println(publicVariable);
	}
	
	protected void protectedFunction()
	{
		System.out.println("---------------------------------------------");
		System.out.println(privateVariable);
		System.out.println(defaultVariable);
		System.out.println(protectedVariable);
		System.out.println(publicVariable);
	}
	
	public void publicFunction()
	{
		System.out.println("---------------------------------------------");
		System.out.println(privateVariable);
		System.out.println(defaultVariable);
		System.out.println(protectedVariable);
		System.out.println(publicVariable);
	}
	
	
	public static void main(String[] args) 
	{
		A a = new A();
		a.privateFunction();
		a.defaultFunction();
		a.protectedFunction();
		a.publicFunction();
		
	}

}
