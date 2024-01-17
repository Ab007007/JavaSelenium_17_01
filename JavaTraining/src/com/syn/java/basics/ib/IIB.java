package com.syn.java.basics.ib;

public class IIB {

	static int counter = 1;

	
	{
		System.out.println("[IIB ] Creating object for " + counter + " time");
		counter++;
	}
	
	IIB() {
		System.out.println("[C] Calling Constructor");
	}
	
	public static void main(String[] args) {
		System.out.println("--- Main Started ---");
		new IIB();
		System.out.println("--- Main Ended ---");

	}
}
