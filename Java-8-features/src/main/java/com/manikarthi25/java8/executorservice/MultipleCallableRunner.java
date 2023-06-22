package com.manikarthi25.java8.executorservice;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MultipleCallableRunner {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService executorService = Executors.newFixedThreadPool(1);
		List<CallableTask> tasks = List.of(new CallableTask("Manikandan"), new CallableTask("Mohith"),
				new CallableTask("Mahith"));
		String result = executorService.invokeAny(tasks);

		System.out.println(result); // Anyone will execute from tasks

		/*
		 * Hello Manikandan
		 */
		executorService.shutdown();

	}

}
