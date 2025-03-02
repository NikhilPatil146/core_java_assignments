package com.fileHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Buffer {
    public static void main(String[] args) throws IOException {
            String filePath = "too.txt";
        	BufferedReader br = new BufferedReader(new FileReader(filePath));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
       
    }
}
