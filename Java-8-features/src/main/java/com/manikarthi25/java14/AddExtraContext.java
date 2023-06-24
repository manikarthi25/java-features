package com.manikarthi25.java14;

class Sample {
	String str = null;
}

public class AddExtraContext {

	public static void main(String[] args) {

		String str = null;

		System.out.println(str.isBlank());
		// Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.isBlank()"
		// because "str" is null
		// at com.manikarthi25.java14.AddExtraContext.main(AddExtraContext.java:8)

		Sample sample = new Sample();
		System.out.println(sample.str.isBlank());
		// Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.isBlank()"
		// because "sample.str" is null
		// at com.manikarthi25.java14.AddExtraContext.main(AddExtraContext.java:13)

	}

}

// Added extra context in error and exception