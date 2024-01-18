package com.syn.java.basics.exceptions;

public class BalanceInsufficientException extends Exception
{

	
	public BalanceInsufficientException()
	{
		System.out.println("[ constructor ] please check your balance");
	}
	
	
	
	public BalanceInsufficientException(double balance)
	{
		System.out.println("[ constructor ] Your balance is " + balance + " withdraw within the available balance");
	}
	
	
	@Override
	public String getMessage() {
		return "Insufficient Balance";
	}
}
