package com.manikarthi25.java8.executorservice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceRunner {
	
	public static void main(String a[]) {
		/*
		ExecutorService executorService = Executors.newSingleThreadExecutor();//Only one thread can run at a time
		executorService.execute(new Task1());
		executorService.execute(new Thread(new Task2()));
		
		/*
		 	Task1 Started 
			1 2 3 4 5 6 7 8 9 
			Task1 Done 
			Task2 Started 
			10 11 12 13 14 15 16 17 18 19 
			Task1 Done 

		 */
		ExecutorService executorService = Executors.newFixedThreadPool(2);//Maximum 2 thread will be active
		executorService.execute(new Task3(1));
		executorService.execute(new Task3(2));
		executorService.execute(new Task3(3));
		executorService.execute(new Task3(4));
		executorService.execute(new Task3(5));
		
		/*
		 	Task 1 Started 
			10 11 12 13 14 15 16 17 18 Task 2 Started 
			20 21 22 23 24 25 19 
			Task 1  Done 
			26 27 Task 3 Started 
			30 31 32 33 34 35 36 37 38 39 28 29 
			Task 2  Done 
			
			Task 3  Done 
			Task 5 Started 
			Task 4 Started 
			40 50 41 51 42 52 43 53 44 54 55 56 45 57 46 58 47 59 48 
			Task 5  Done 
			49 
			Task 4  Done
		 */
		executorService.shutdown();
	}

}
