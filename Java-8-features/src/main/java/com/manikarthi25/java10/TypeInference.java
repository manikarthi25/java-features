package com.manikarthi25.java10;

import java.util.List;

public class TypeInference {

	public static void main(String[] args) {

		List<String> names1 = List.of("Mani", "Raj");
		List<String> names2 = List.of("Mohith", "Mahith");
		
		var names = List.of(names1, names2); // var -> TypeInference List<List<String>>
		names.stream().forEach(System.out::print);
		
		//var str = null; // can not assign null value in var
		
		for(var name : names1) {
			System.out.print(name + " ");
		}
		
	}

}


//Output 
//[Mani, Raj][Mohith, Mahith]
//ManiRaj


// var is not a keyword