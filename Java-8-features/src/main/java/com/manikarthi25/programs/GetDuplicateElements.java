package com.manikarthi25.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GetDuplicateElements {

	public static void main(String[] args) {

		List<Integer> duplicateList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 6, 5);

		Map<Integer, Integer> map = new HashMap<>();
		List<Integer> duplicateValues = new ArrayList<>();

		duplicateList.stream().forEach(e -> {
			if (map.containsKey(e)) {
				duplicateValues.add(e);
			} else {
				map.put(e, e);
			}
		});
		System.out.print(duplicateValues);
	}

}
