package com.manikarthi25.programs;

import java.util.Arrays;
import java.util.List;

public class FindAnyVsFindFirst {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,6,5,4,3,4);
		
		//FindAny		
		Integer findAny = list.stream().parallel().findAny().get();
		System.out.println("Find First : "+findAny);
		
		//FindFirst	
		Integer findFirst = list.stream().parallel().findFirst().get();
		System.out.println("Find First : "+findFirst);
	
	}

}


/*
Find First : 6
Find First : 1
*/