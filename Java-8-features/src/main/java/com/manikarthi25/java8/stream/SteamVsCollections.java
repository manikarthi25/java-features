package com.manikarthi25.java8.stream;

import java.util.ArrayList;
import java.util.stream.Stream;

public class SteamVsCollections {

	public static void main(String a[]) {

		ArrayList<String> nameList = new ArrayList<>();
		nameList.add("Mani"); // we can add element in Collection, Can't add in stream
		nameList.add("praise");
		nameList.add("raj");
		System.out.println("Name List : " + nameList);

		nameList.remove(2); // We can remove element from collect, not in stream
		System.out.println("After remove - Name List :" + nameList);

		nameList.set(1, "Karthi"); // we can modify element in list, not in stream
		System.out.println("After Modify Name List : " + nameList);
		
		System.out.println(nameList.get(1)); // Get element any element - any order in collection, but in stream sequential order
		
		Stream<String> nameStream = nameList.stream(); // Stream create without affecting original ArrayList
		
		System.out.println("External Iteration in Collection");
		for(String name : nameList) {
			System.out.println(name); // External Iteration in Collection
		}
		
		System.out.println("Internal Iteration in Collection");
		nameStream.forEach(name -> System.out.println(name)); //Internal Iteration in Stream
		

	}

}
