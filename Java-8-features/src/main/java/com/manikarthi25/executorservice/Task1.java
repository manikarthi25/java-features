package com.manikarthi25.executorservice;

public class Task1 extends Thread {
	
	public void run() {
		System.out.println("Task1 Started ");
		for(int i=1; i<=9; i++) {
			System.out.print(i + " ");
		}
		System.out.println("\nTask1 Done ");
		
	}

}
