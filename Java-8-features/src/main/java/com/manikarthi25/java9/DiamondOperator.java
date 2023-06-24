package com.manikarthi25.java9;

abstract class ABCD<T> {
	abstract T show(T a, T b);
}

public class DiamondOperator {

	public static void main(String[] args) {
		ABCD<String> a = new ABCD<>() { // diamond operator is empty, compiler infer type
			String show(String a, String b) {
				return a + b;
			}
		};
		String result = a.show("Java", "9");
		System.out.println(result);
	}
}

/*
 <>  -> diamond operator
 allows us to use diamond operator with anonymous classes
*/

/*
output
-------
Java9
*/


/*
 DiamondOperator.java:7: error: cannot infer type arguments for ABCD<T>
		ABCD<String> a = new ABCD<>() {
		                         ^
  reason: cannot use '<>' with anonymous inner classes
  where T is a type-variable:
    T extends Object declared in class ABCD
1 error
*/
