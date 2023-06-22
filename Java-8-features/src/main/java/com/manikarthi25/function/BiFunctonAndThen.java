package com.manikarthi25.function;

import java.util.function.BiFunction;
import java.util.function.Function;

public class BiFunctonAndThen {

	public static void main(String[] args) {

		// Math.pow(a1, a2) returns Double
		BiFunction<Integer, Integer, Double> func1 = (a1, a2) -> Math.pow(a1, a2);

		// takes Double, returns String
		Function<Double, String> func2 = (input) -> "Result : " + String.valueOf(input);

		String result = func1.andThen(func2).apply(2, 4);

		System.out.println(result);

	}

}

/* output
Result : 16.0
*/


/* the above program - other way

public static void main(String[] args) {

String result = powToString(2, 4,
        (a1, a2) -> Math.pow(a1, a2),
        (r) -> "Result : " + String.valueOf(r));

System.out.println(result); // Result : 16.0

}

public static <R> R powToString(Integer a1, Integer a2,
                            BiFunction<Integer, Integer, Double> func,
                            Function<Double, R> func2) {

return func.andThen(func2).apply(a1, a2);

}

*/