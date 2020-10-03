package com.manikarthi25.optional;

import java.util.Optional;

public class OptionalEmptyOfNullable {
	
	public static Optional<String> ofNullable() {
		Optional<String> stringOptional = Optional.ofNullable("Hello"); // if pass null instead of Hello, it return Optional.empty, not null or exception
		// Optional<String> stringOptional = Optional.ofNullable(null);
		return stringOptional;
	}

	public static Optional<String> of() {
		Optional<String> stringOptional = Optional.of("Hello"); // if pass null instead of Hello, it return exception
		// Optional<String> stringOptional = Optional.of(null);
		return stringOptional;
	}
	public static Optional<String> empty() {
		return Optional.empty();
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("Of Nullable : " + ofNullable());
		System.out.println("Of Nullable : " + of());
		System.out.println("Of Nullable : " + empty());
		
	}

}
