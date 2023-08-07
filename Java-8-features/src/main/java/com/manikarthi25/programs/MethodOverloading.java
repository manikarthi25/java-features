package com.manikarthi25.programs;

public class MethodOverloading {

	public void testMethodOverloading(Exception e) {
		System.out.println("Exception : "+e);
	}
	
	public void testMethodOverloading(Object obj) {
		System.out.println("Object : "+obj);
	}
	
	public void testMethodOverloading(String str) {
		System.out.println("String : "+str);
	}
	public static void main(String[] args) {
		
		MethodOverloading obj = new MethodOverloading();
		//obj.testMethodOverloading(null); // The method testMethodOverloading(Exception) is ambiguous for the type MethodOverloading
		obj.testMethodOverloading("null"); // String : null

	}

}
