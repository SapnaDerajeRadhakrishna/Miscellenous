package org.maxwell.java8.lambda;

import java.util.Arrays;
import java.util.List;

public class ForEach {
	public static void main(String[] a) {

		// Old way:
		List<Integer> oldList = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
		for (Integer n : oldList) {
			System.out.println(n);
		}

		// New way:
		List<Integer> newList = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
		newList.forEach(n -> System.out.println(n));

		// or we can use :: double colon operator in Java 8
		newList.forEach(System.out::println);

	}
}
