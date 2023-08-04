package com.manikarthi25.programs;

import java.util.Arrays;

public class FindMaxElementInArray {

	public static int maxValue(int[] arr) {
		return Arrays.stream(arr).max().getAsInt();

	}
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,7,5,4};
		System.out.println(maxValue(arr));
		
	}

}

//7
