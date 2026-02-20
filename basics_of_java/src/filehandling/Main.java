package filehandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException{
		// It won't create physical file, it is just pointing to that path
		File file = new File("Test.java");
		System.out.println("File object is created.");
		
		if (file.createNewFile()) {
			System.out.println("New file created.");
		}
		else {
			System.out.println("File already exists.");
		}
		
		FileWriter writier = new FileWriter("test.java");
		writier.write("Hello There");
		writier.close();
		System.out.println("Completed");
	}
}


// File - represents a file or folder
// FileWriter - write text to file
// FileReader - read text from file
// BufferedWriter - fast writing
// BufferedReader - fast reading