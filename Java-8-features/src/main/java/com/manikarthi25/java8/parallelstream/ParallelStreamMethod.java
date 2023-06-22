package com.manikarthi25.java8.parallelstream;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

public class ParallelStreamMethod {
	
	public static void main(String a[]) throws IOException {
		// Creating a File object
        File fileName = new File("C:\\Users\\Mani\\Documents\\Textfile.txt");
 
        // Reading the lines of the text file by
        // create a List using readAllLines() method
        List<String> text = Files.readAllLines(fileName.toPath());
 
        // Creating parallel streams by creating a List
        //  using readAllLines() method
        text.parallelStream().forEach(System.out::println);
		
/*
Method 2: Using parallelStream() on a Collection

The parallelStream() method of the Collection interface returns a possible parallel stream
 with the collection as the source. Let us explain the working with the help of an example.

Implementation:

In the code given below, we are again using parallel streams but
here we are using a List to read from the text file. Therefore, we need the parallelStream() method.
 */
	}

}
