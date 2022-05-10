package com.manikarthi25.executorservice;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class CallableTask implements Callable<String> {

	private String name;

	public CallableTask(String name) {
		this.name = name;
		
	}
	
	@Override
	public String call() throws Exception {
		Thread.sleep(1000);
		return "Hello " +name;
	}
	
}

public class CallableRunner {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService executorService = Executors.newFixedThreadPool(1);
		Future<String> future = executorService.submit(new CallableTask("Manikandan"));
		//Future - get the value from thread,e
		//Future is promise on
		String name = (String) future.get();
		//after getting value from get method, then will execute the below code
		System.out.println(name);
		System.out.println("Callable Done");
		
		System.out.println("Main method completed");
		
		/*
		 	Hello Manikandan
			Callable Done
			Main method completed

		 */
		
		executorService.shutdown();
		

	}

}
