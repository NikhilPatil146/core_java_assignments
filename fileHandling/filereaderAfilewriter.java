package com.fileHandling;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class filereaderAfilewriter {

	public static void main(String[] args) throws IOException {
		FileWriter fw=new FileWriter("too1.txt");
		String s1="This is file Writer/reader demo";
		fw.write(s1);
		fw.flush();
		fw.close();
		
		FileReader fr=new FileReader("too1.txt");
		int i;
		while((i=fr.read())!=-1)
		{
			System.out.print((char)i);
		}
		fr.close();
	}
}
