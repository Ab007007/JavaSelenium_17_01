package com.syn.java.basics.files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo {

	
	public static void main(String[] args) {
		
		File f = new File("./abc.txt");
		FileInputStream fis = null;
		try 
		{
			fis = new FileInputStream(f);
			int i = 0;
			while((i=fis.read())!=-1)
			{
				System.out.print((char)i);
			}
		} 
		catch (FileNotFoundException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally 
		{
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
