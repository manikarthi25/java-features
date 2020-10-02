package com.manikarthi25.defaultmethod;

public class Client123 implements Interface1, Interface2, Interface3 { 

	public static void main(String[] args) {
		
		// can implement multiple inheritance
		// first priority implementation class method , next interface, main interface - Method name is same
		Client123 client123 = new Client123();
		client123.displayA();
		client123.displayB();
		client123.displayC();

	}

}
