package Map;

import java.util.Map;

public class MapofEntries {

	public static void main(String[] args) {
		// Creating Map Entry
		Map.Entry<Integer, String> e1 = Map.entry(101, "Java");
		Map.Entry<Integer, String> e2 = Map.entry(102, "Spring");
		// Creating Map using map entries
		Map<Integer, String> map = Map.ofEntries(e1, e2);
		// Iterating Map
		for (Map.Entry<Integer, String> m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
	}

}


/*
In Java 9, apart from static Map.of() methods, Map interface includes one more static method Map.ofEntries(). 
This method is used to create a map of Map.Entry instances.
*/

/*
output
-------
102 Spring
101 Java
*/