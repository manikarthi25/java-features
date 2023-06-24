package com.manikarthi25.java9.factorymethods;

import java.util.Set;

public class FactoryMethodInSet {
	
	public static void main(String[] args) {  
        Set<String> set = Set.of("Java","JavaFX","Spring","Hibernate","JSP");  
        for(String l:set) {  
            System.out.println(l);  
        }  
    }  

}


/*
Java Set interface provides a Set.of() static factory method which is used to create immutable set. 
The set instance created by this method has the following characteristcis.

It is immutable
No null elements
It is serializable if all elements are serializable.
No duplicate elements.
The iteration order of set elements is unspecified and is subject to change.
*/

/*
output
-------
JSP
Java
Spring
Hibernate
JavaFX
*/