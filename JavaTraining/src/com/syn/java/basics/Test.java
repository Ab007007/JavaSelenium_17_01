package com.syn.java.basics;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {

	
	public static void main(String[] args) {
		SimpleDateFormat sd = new SimpleDateFormat("dd");		
		String currentDay = sd.format(new Date());
		System.out.println(Integer.parseInt(currentDay)+2);
	}
}
