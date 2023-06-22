package com.manikarthi25.parallelstream;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.stream.Stream;

public class ParallelMethod {

	public static void main(String[] args) throws IOException {
		File fileName = new File("C:\\Users\\Mani\\Documents\\Textfile.txt");
		 
        // Create a Stream of string type
        // using the lines() method to
        // read one line at a time from the text file
        Stream<String> text = Files.lines(fileName.toPath());
 
        // Creating parallel streams using parallel() method
        // later using forEach() to print on console
        text.parallel().forEach(System.out::println);
 
        // Closing the Stream
        // using close() method
        text.close();
        
/*
 Normally any java code has one stream of processing, where it is executed sequentially.
 Whereas by using parallel streams, we can divide the code into multiple streams 
 that are executed in parallel on separate cores and the final result is the combination of the individual 
 outcomes. The order of execution, however, is not under our control.
 */
        
/*
Ways to Create Stream 
There are two ways we can create which are listed below and described later as follows:

Using parallel() method on a stream
Using parallelStream() on a Collection 
Method 1: Using parallel() method on a stream

The parallel() method of the BaseStream interface returns an equivalent parallel stream. 
Let us explain how it would work with the help of an example.

In the code given below, we create a file object which points to a pre-existent ‘txt’ file in the system.
Then we create a Stream that reads from the text file one line at a time. 
Then we use the parallel() method to print the read file on the console. 
The order of execution is different for each run, you can observe this in the output. 
The two outputs given below have different orders of execution.
 */

	}

}
