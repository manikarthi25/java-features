package com.manikarthi25.programs;

import java.util.Arrays;
import java.util.List;

public class FindFirstElement {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(22,2,3,4,5,6,7,8,5,4,3,1);
		
		list.stream().findFirst().ifPresent(System.out::print);
	}

}


//22