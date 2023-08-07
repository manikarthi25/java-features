package com.manikarthi25.programs;

import java.util.HashMap;
import java.util.Map;

public class FindingDuplication {
	
	public static void findFrequencyOfDuplicationStrings(String word) {
		
		String[] words = word.split(" ");
		Map<String, Integer> map = new HashMap<>();
		
		for(String str : words) {
			if(map.get(str) != null) {
				map.put(str, map.get(str) + 1);
			} else {
				map.put(str, 1);
			}
			
		}
		
		System.out.println("find frequency of Duplication String :" + map);
		
	}
	
public static void findFrequencyOfDuplicationCharacters(String word) {
		
		Map<Character, Integer> map = new HashMap<>();
		
		for(int i = 0; i< word.length(); i++) {
			Character c = word.charAt(i);
			if(map.get(c) != null) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
			
		}
		
		System.out.println("find frequency of Duplication Characters :" + map);
		
	}
	
	public static void main(String a[]) {
		
		findFrequencyOfDuplicationStrings("Mani Mani Mohi Mahi Mohi");
		findFrequencyOfDuplicationCharacters("Manikandan");
		
	}

}
