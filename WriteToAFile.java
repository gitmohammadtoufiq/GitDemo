package Coding;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToAFile {

	public static void main(String[] args) throws IOException {
		BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
		writer.write("this is a new file \n . new line");
		writer.write("this is another line");
		writer.close();
	}

}
