package com.inputoutput;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Fileread {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream fos=new FileOutputStream("too.txt");
		String s1=" Implement a file copy programusing FileInputStream and FileOutputStream ";
		byte b[]=s1.getBytes();
		fos.write(b);
		fos.flush();
		fos.close();
        System.out.println("File Written Succesfully");
		
		FileInputStream fis=new FileInputStream("too.txt");
		int i;
		while((i=fis.read())!=-1)
		{
			System.out.print((char)i);
		}
		fis.close();
		
	}
}
