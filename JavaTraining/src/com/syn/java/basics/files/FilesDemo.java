package com.syn.java.basics.files;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;

public class FilesDemo
{
	
	public static void main(String[] args) throws IOException {
		File f = new File("./abc.txt");
		if(!f.exists())
		{
			System.out.println("File doesnot exist. Creating a file ");
			f.createNewFile();
		}
		else
		{
			System.out.println("File already present ");
		}
		
		System.out.println("Executable : " + f.canExecute());
		System.out.println("Writable : " + f.canWrite());
		System.out.println("Readable : " + f.canRead());
		System.out.println("Absolute Path " + f.getAbsolutePath());
		
		printFileNameWithDetails();
	}
	
	public static void printFileInfo(File f)
	{
		System.out.println("------------------------------------------------");
		System.out.println("Executable : " + f.canExecute());
		System.out.println("Writable : " + f.canWrite());
		System.out.println("Readable : " + f.canRead());
		System.out.println("Absolute Path " + f.getAbsolutePath());
		System.out.println("last modified " + new Date(f.lastModified()));
		System.out.println("last modified " + new SimpleDateFormat("MMMM dd,yyyy hh:mm:ss").format((f.lastModified())));
		System.out.println("------------------------------------------------");
		
	}
	public static void printFileNames()
	{
		File f = new File("d:\\");
		String[] filenames = f.list();
		
		for(String filename : filenames)
		{
			System.out.println(filename);
		}
	}

	
	public static void printFileNameWithDetails()
	{
		File f = new File("d:\\");
		File[] filenames = f.listFiles();
		
		for(File filename : filenames)
		{
			printFileInfo(filename);
		}
	}
}
