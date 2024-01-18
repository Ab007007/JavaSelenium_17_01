package com.syn.java.basics.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
	
	public static void main(String[] args) throws IOException {
		File f = new File("./abc.txt");
		FileWriter fw = new FileWriter(f, true);
		fw.write("\nWElcome to Java Training\n");
		fw.close();
	
	}

}
