package com.manikarthi25.java9;

interface PrivateMethod {
	default void display() {
		privateNonStaticMethod();
		privateStaticMethod();
	}

	private void privateStaticMethod() {
		System.out.println("private non static method");
	}

	private static void privateNonStaticMethod() {
		System.out.println("private static method");		
	}
}
public class PrivateMethodInInterface implements PrivateMethod {

	public static void main(String[] args) {
		PrivateMethod privateMethod = new PrivateMethodInInterface();
		privateMethod.display();

	}

}

/*
 In Java 9, we can create private methods inside an interface. 
 Interface allows us to declare private methods that help to share common code between non-abstract methods.
 we can also create private static methods inside an interface
 
 Before Java 9, creating private methods inside an interface cause a compile time error
*/

/*
output
-------
private static method
private non static method

*/
