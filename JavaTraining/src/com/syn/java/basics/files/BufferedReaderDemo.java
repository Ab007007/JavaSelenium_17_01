package com.syn.java.basics.files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderDemo {

	
	public static void main(String[] args) throws IOException 
	{
		File f = new File("./abc.txt");
		
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		String line = null;
		while((line=br.readLine())!=null)
		{
			System.out.println(line);
		}
		
		br.close();
		fr.close();
	}
}
