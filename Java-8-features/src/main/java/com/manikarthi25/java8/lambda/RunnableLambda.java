package com.manikarthi25.java8.lambda;

public class RunnableLambda {

	public static void main(String a[]) {

		// With out lambda
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				System.out.println("Without Lamda");
			}
		};
		new Thread(runnable).start();

		// With Lambda
		Runnable runnableWithLambda = () -> {
			System.out.println("With Lamda with curly");
		};
		new Thread(runnableWithLambda).start();

		Runnable runnableWithLambda1 = () -> System.out.println("With Lamda without curly");
		new Thread(runnableWithLambda1).start();

		new Thread(() -> System.out.println("With Lamda short")).start();
	}

}
