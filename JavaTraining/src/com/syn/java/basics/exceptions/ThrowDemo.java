package com.syn.java.basics.exceptions;

import java.util.Scanner;

public class ThrowDemo 
{
	public static double balance = 10000;
	public static Scanner sc = null;
	/*
	 * 1. Add one more functionality - Check Balance
	 * 2. Ask user what is the operation he / she want to do
	 * 		Choice 1. Balance Check
	 * 		Choice 2. Amount withdraw
	 * 3. Allow max 3 transactions Only
	 * 
	 */
	public static void main(String[] args) 
	{
		String choice = null;
		sc = new Scanner(System.in);
		System.out.println("Welcome to Amount withdrawal!!");
		do {
			System.out.println("Enter the amount you want to withdraw");
			int amount = sc.nextInt();
			double tempBalance = balance;
			tempBalance = tempBalance - amount;
			if(tempBalance<0)
			{
				try
				{
					throw new BalanceInsufficientException();
				}
				catch(BalanceInsufficientException ex)
				{
					System.out.println("[ catch ] please withdraw less than " + balance);
					System.out.println("[ catch - getmessage ]" + ex.getMessage());
				}
			}
			else
			{
				balance = tempBalance;
			}
			System.out.println("your Current balance is " + balance);
			System.out.println(" do you want to perform one more transaction `yes/no`");
			choice = sc.next();
			
		}while(choice.equals("yes"));
		System.out.println("Thank you for visiting!!!");
	}
}
