package com.manikarthi25.programs;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class IsContainsDuplicateValue {

	public static boolean containsDuplicate(int[] nums) {
	    List<Integer> list = Arrays.stream(nums)
	                               .boxed()
	                               .collect(Collectors.toList());
	    Set<Integer> set = new HashSet<>(list);
	     if(set.size() == list.size()) {
	       return false;
	   } 
	      return true;
	  }
	public static void main(String[] args) {
		
		int[] nums1 = {1,2,3,4,5,1};
		System.out.println(containsDuplicate(nums1));
		
		int[] nums2 = {1,2,3,4,5};
		System.out.println(containsDuplicate(nums2));

	}

}
//Given an integer array nums, 
//return true if any value appears at least twice in the array, 
//and return false if every element is distinct.

/*
true
false
*/