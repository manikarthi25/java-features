package com.manikarthi25.consumer;

import java.util.function.Consumer;

public class ConsumerExample {
	
	public static void main(String a[]) {
		Consumer<String> consumer = (name) -> System.out.println("Change to Upper Case Letter : " +name.toUpperCase());
		
		consumer.accept("mani");
	}

}
