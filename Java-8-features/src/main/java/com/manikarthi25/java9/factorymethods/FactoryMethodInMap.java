package com.manikarthi25.java9.factorymethods;

import java.util.Map;

public class FactoryMethodInMap {
	
	public static void main(String[] args) {  
        Map<Integer,String> map = Map.of(101,"JavaFX",102,"Hibernate",103,"Spring MVC");  
        for(Map.Entry<Integer, String> m : map.entrySet()){    
            System.out.println(m.getKey()+" "+m.getValue());  
        }  
    }  

}


/*
In Java 9, Map includes Map.of() and Map.ofEntries() static factory methods that provide a convenient way to creae immutable maps.
Map created by these methods has the following characteristics.

It is immutable
It does not allow null keys and values
It is serializable if all keys and values are serializable
It rejects duplicate keys at creation time
The iteration order of mappings is unspecified and is subject to change.
*/

/*
output
-------
101 JavaFX
103 Spring MVC
102 Hibernate

*/