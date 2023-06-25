package com.manikarthi25.java8.defaultmethod;

import java.util.Arrays;
import java.util.List;

public class MultiplierClient {
	
	public static void main(String a[]) {
		List<Integer> integerList = Arrays.asList(1,4,5);
		Multiplier multiplier = new MultiplierImple();
		
		System.out.println("Multiply result is :" + multiplier.multiply(integerList));
		System.out.println("Default method - list size is :" + multiplier.size(integerList));
		System.out.println("static method - list size is :" + Multiplier.isEmpty(integerList));}

}

/*
Multiply result is :20
Inside interface
Default method - list size is :3
static method - list size is :true
*/