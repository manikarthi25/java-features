package com.manikarthi25.programs;

import java.util.Arrays;
import java.util.List;

public class CubeOnListElements {

	public static void main(String[] args) {
		
		List<Integer> integerList = Arrays.asList(4,5,6,7,1,2,3);
		
		integerList.stream().map(i -> i*i*i).filter(i -> i>50).forEach(System.out::println);

	}

}

//to perform cube on list elements and filter numbers greater than 50.
/*
64
125
216
343
*/