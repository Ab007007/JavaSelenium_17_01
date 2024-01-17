package com.syn.java.basics.methods;

import java.util.Scanner;

public class MethodsDemo {

	static Scanner sc ;  
	public static void main(String[] args) 
	{
		sc = new Scanner(System.in);
		sum();
		
		sum(55, 66);
		sum(5, 6);
		sum(15, 16);
		
	}
	
	public static void sum()
	{
		System.out.println("Sum of two numbers...");
		
		System.out.println("Enter first number ");
		int num1 = sc.nextInt();  //int num1 = 100;
		
		System.out.println("Enter Second number ");
		int num2 = sc.nextInt();
		
		System.out.println("Sum of two numbers is  : " + (num1 + num2));
	}
	
	
	public static void sum(int a , int b)
	{
		System.out.println("Sum of two numbers is  : " + (a + b));
	}
}
