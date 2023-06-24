package com.manikarthi25;

public class StringTest {
	public static void main(String[] args) {
		
		String s1 = new String("mani");
		String s2 = s1.intern();
		String s3 = "mani";
		String s4 = "mani";
		
		System.out.println("s1 == s3 : " + (s1==s3) );
		System.out.println("s2 == s3 : " + (s2==s3) );
		System.out.println("s3 == s4 : " + (s3==s4) );
		
        System.out.println("s1.equals(s3) : " + (s1.equals(s3)) );
		System.out.println("s2.equals(s3): " + (s2.equals(s3)) );
		System.out.println("s3.equals(s4): " + (s3.equals(s4)) );
		
		
	}

}
