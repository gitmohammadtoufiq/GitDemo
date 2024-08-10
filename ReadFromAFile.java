package Coding;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFromAFile {

	public static void main(String[] args) throws IOException {
		
		try {
			BufferedReader reader = new BufferedReader(new FileReader("output.txt"));
			
			String line;
			
			while ((line = reader.readLine())!= null) {
				System.out.println(line);
				
			}
			reader.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
