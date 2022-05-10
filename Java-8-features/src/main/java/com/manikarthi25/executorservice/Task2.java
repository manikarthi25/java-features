package com.manikarthi25.executorservice;

public class Task2 implements Runnable {

	@Override
	public void run() {
		System.out.println("Task2 Started ");
		for(int i=10; i<=19; i++) {
			System.out.print(i + " ");
		}
		System.out.println("\nTask1 Done ");
		
	}
}
