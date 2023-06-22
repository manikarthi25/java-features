package com.manikarthi25.java8.defaultmethod;

public class Client14 implements Interface1, Interface4 {
	
    // Conflict occur - If both interface have same method
	// Copy that implementation and paste in implementation class and replace default keyword into public
	public void displayA() {
		System.out.println("Interface1 :" + Client14.class);
	}
	
	public static void main(String[] args) {
		
		Client14 client14 = new Client14();
		client14.displayA();

	}

}
