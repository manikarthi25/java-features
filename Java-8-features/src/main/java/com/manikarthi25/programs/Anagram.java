package com.manikarthi25.programs;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Anagram {

//Using Array
	public static boolean isAnagramUsingArray(String str1, String str2) {

		if (str1.length() != str2.length()) {
			System.out.println("String 1 : " + str1);
			System.out.println("String 2 : " + str2);
			return false;
		} else {
			// convert from string to char array
			char[] str1Char = str1.toCharArray();
			char[] str2Char = str2.toCharArray();

			// sort character
			Arrays.sort(str1Char);
			Arrays.sort(str2Char);

			return Arrays.equals(str1Char, str2Char);
		}

	}

//Using Collection
	public static boolean isAnagramUsingCollection(String str1, String str2) {

		if (str1.length() != str2.length()) {
			System.out.println("String 1 : " + str1);
			System.out.println("String 2 : " + str2);
			return false;
		} else {
			Map<Character, Integer> strMap1 = new HashMap<>();
			Map<Character, Integer> strMap2 = new HashMap<>();

			for (int i = 0; i < str1.length(); i++) {
				Character c = str1.charAt(i);
				if (strMap1.get(i) == null) {
					strMap1.put(c, 1);
				} else {
					strMap1.put(c, strMap1.get(i) + 1);
				}
			}

			for (int i = 0; i < str2.length(); i++) {
				Character c = str2.charAt(i);
				if (strMap2.get(i) == null) {
					strMap2.put(c, 1);
				} else {
					strMap2.put(c, strMap1.get(i) + 1);
				}
			}

			return strMap1.equals(strMap2);
		}

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter String 1 :");
		String str1 = sc.nextLine();

		System.out.println("Please enter String 2 :");
		String str2 = sc.nextLine();

		// removing space
		str1 = str1.replaceAll("\\s", "").toLowerCase();
		str2 = str2.replaceAll("\\s", "").toLowerCase();

		if (isAnagramUsingCollection(str1, str2))
			System.out.println(str1 + " and " + str2 + " are anagram string - Using Collections");
		else
			System.out.println(str1 + " and " + str2 + " are NOT anagram string - Using Collections");

		if (isAnagramUsingArray(str1, str2))
			System.out.println(str1 + " and " + str2 + " are anagram string - Using Array");
		else
			System.out.println(str1 + " and " + str2 + " are NOT anagram string - Using Array");
	}

}
