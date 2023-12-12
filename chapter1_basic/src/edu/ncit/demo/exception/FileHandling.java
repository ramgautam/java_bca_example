package edu.ncit.demo.exception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

// External resource- file, database, hardware related item., modem. printer, bar code reader. . 

public class FileHandling {
	public static void main(String args[]) {
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("/Users/ramgautam/Documents/Java_class_Daily_points"));

			StringBuilder sb = new StringBuilder();
			String line = br.readLine();

			while (line != null) {
				sb.append(line);
				sb.append(System.lineSeparator());
				line = br.readLine();
			}
			String everything = sb.toString();
			System.out.println("Content ::"+ everything);
			
			// you need to check whether. if there is not printer installed or not,. 
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
		
				if (br != null) {
					try {
						br.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
		
		}
	}

}
