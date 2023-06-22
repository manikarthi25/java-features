package com.manikarthi25.executorservice;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MultipleAnyCallableRunner {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService executorService = Executors.newFixedThreadPool(1);
		List<CallableTask> tasks = List.of(new CallableTask("Manikandan"), new CallableTask("Mohith"), new CallableTask("Mahith"));
		List<Future<String>> results = executorService.invokeAll(tasks);
		
		for(Future<String> result : results) {
			System.out.println(result.get());
		}
		
		/*
		 	Hello Manikandan
			Hello Mohith
			Hello Mahith

		 */
		executorService.shutdown();

	}

}
