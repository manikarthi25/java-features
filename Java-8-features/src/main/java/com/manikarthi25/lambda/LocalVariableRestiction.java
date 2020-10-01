package com.manikarthi25.lambda;

import java.util.function.Consumer;

public class LocalVariableRestiction {
	
	static int i = 0;

	public static void main(String a[]) {
		
		//int i = 0;
		
		/*Consumer<Integer> c1 = (i) -> { // Lambda expression's parameter i cannot redeclare another local variable defined in an enclosing scope.
			System.out.println(i);
		};
		
		Consumer<Integer> c2 = (i1) -> { 
			int i; // Lambda expression's local variable i cannot redeclare another local variable defined in an enclosing scope.
			System.out.println(i);
		}; 
		
		Consumer<Integer> c3 = (i1) -> { 
			//i = i +10; // Local variable i defined in an enclosing scope must be final or effectively final
			System.out.println(i+10); // we can use like this, but not reassign local variable
		}; */
		
		Consumer<Integer> c3 = (i) -> { 
			i = i +10; // We can modify or  use as parameter using instance variable
			System.out.println(i);
		};
		
		c3.accept(10);
		
		
	}

}
