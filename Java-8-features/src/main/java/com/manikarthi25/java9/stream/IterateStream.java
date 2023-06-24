package com.manikarthi25.java9.stream;

import java.util.stream.Stream;

public class IterateStream {

	    public static void main(String[] args) {  
	        Stream.iterate(1, i -> i <= 10, i -> i*3)  
	        .forEach(System.out::println);  
	    }  

}


/*
output
-------
1
3
9
*/

/*
A new overloaded method iterate is added to the Java 9 stream interface. 
This method allows us to iterate stream elements till the specified condition.

It takes three arguments, seed, hasNext and next.
*/
