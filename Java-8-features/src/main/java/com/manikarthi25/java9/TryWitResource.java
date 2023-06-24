package com.manikarthi25.java9;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class TryWitResource {

	public static void main(String[] args) throws FileNotFoundException {
		FileOutputStream fileStream = new FileOutputStream("javatpoint.txt");
		// try(FileOutputStream fileStream = new FileOutputStream("javatpoint.txt");) { can use like this in java 7
		try (fileStream) { // java 9 and above
			String greeting = "Welcome to javaTpoint.";
			byte b[] = greeting.getBytes();
			fileStream.write(b);
			System.out.println("File written");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}

/*
program would not work with Java 7 because we can't put resource declared outside the try-with-resource.
try-with-resource is improved in Java 9 and now we can use reference of the resource that is not declared locally.
*/

/*
output
-------
File written
*/
