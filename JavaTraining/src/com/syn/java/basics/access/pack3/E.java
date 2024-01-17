package com.syn.java.basics.access.pack3;

import com.syn.java.basics.access.pack1.A;

public class E extends A 
{
	
	public static void main(String[] args) 
	{
		E e = new E();
		e.protectedFunction();
		e.publicFunction();
		
	}

}
