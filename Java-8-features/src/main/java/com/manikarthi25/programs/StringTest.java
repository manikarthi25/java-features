package com.manikarthi25.programs;

public class StringTest {

	public static void main(String[] args) {
				
		String s1 = new String("mani");
		String s2 = s1.intern();
		String s3 = "mani";
		String s4 = "mani";
		
		System.out.println("s1 == s3 : " + (s1==s3) );//false
		System.out.println("s2 == s3 : " + (s2==s3) );//true
		System.out.println("s3 == s4 : " + (s3==s4) );//true
		
        System.out.println("s1.equals(s3) : " + (s1.equals(s3)) );//true
		System.out.println("s2.equals(s3): " + (s2.equals(s3)) );//true
		System.out.println("s3.equals(s4): " + (s3.equals(s4)) );//true
		
		/*
		String s1 = new String("MANI"); // Line-1 
		  
        // S2 refers to Object in SCP Area
        String s2 = s1.intern(); // Line-2 
          
        // Comparing memory locations
        // s1 is in Heap
        // s2 is in SCP
        System.out.println(s1 == s2); //false
          
        // Comparing only values
        System.out.println(s1.equals(s2)); //true
          
        // S3 refers to Object in the SCP Area 
        String s3 = "MANI"; // Line-3 
        System.out.println(s2 == s3); //true

*/

	}

}
