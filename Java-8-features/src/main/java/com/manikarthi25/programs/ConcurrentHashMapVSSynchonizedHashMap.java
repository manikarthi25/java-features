package com.manikarthi25.programs;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapVSSynchonizedHashMap {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		
		/*
		 * Map<String, Integer> synMap = Collections.synchronizedMap(map);
		  
		   Helper1 helper1 = new Helper1(synMap); 
		   Helper2 helper2 = new Helper2(synMap);
		   Helper3 helper3 = new Helper3(synMap);
		   Helper4 helper4 = new Helper4(synMap);
		  
		  
		  Helper1 Sleeping Helper2 Sleeping Helper3 Sleeping Key : one Value : 1
		  Exception in thread "main" Helper4 Sleeping
		  java.util.ConcurrentModificationException at
		  java.base/java.util.HashMap$HashIterator.nextNode(HashMap.java:1493) at
		  java.base/java.util.HashMap$EntryIterator.next(HashMap.java:1526) at
		  java.base/java.util.HashMap$EntryIterator.next(HashMap.java:1524) at
		  com.java.program.interview.ConcurrentHashMapVSSynchonizedHashMap.main(
		  ConcurrentHashMapVSSynchonizedHashMap.java:25)
		 */
		
		Map<String, Integer> concurrMap = new ConcurrentHashMap<>();

		Helper1 helper1 = new Helper1(concurrMap);
		Helper2 helper2 = new Helper2(concurrMap);
		Helper3 helper3 = new Helper3(concurrMap);
		Helper4 helper4 = new Helper4(concurrMap);

		/*
		 	Helper1 Sleeping
			Helper2 Sleeping
			Helper3 Sleeping
			Key : one Value : 1
			Key : two Value : 2
			Key : three Value : 3
			Helper4 Sleeping
 
		 */

		for (Map.Entry<String, Integer> map1 : concurrMap.entrySet()) {
			System.out.println("Key : " + map1.getKey() + " Value : " + map1.getValue());
		}
	}

}
