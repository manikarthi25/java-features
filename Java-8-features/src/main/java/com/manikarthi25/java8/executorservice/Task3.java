package com.manikarthi25.java8.executorservice;

public class Task3 extends Thread {
	
	private int number;

	public Task3(int number) {
		this.number = number;
	}
	
	public void run() {
		System.out.println("Task " + number + " Started ");
		for(int i=number*10; i<=number*10+9; i++) {
			System.out.print(i + " ");
		}
		System.out.println("\nTask " + number + "  Done ");
		
	}

}
