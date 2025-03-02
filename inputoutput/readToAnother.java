package com.inputoutput;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class readToAnother {

	public static void main(String[] args) throws IOException {
		 // Input and Output file paths
        String inputFile = "input.txt";
        String outputFile = "output.txt";

      
            // Create reader and writer
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));

            String line;
            // Read each line from the input file and write it to the output file
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine(); // Move to the next line
            }

            System.out.println("File content copied successfully!");

            // Close resources
            reader.close();
            writer.close();
        
    
	}
}
