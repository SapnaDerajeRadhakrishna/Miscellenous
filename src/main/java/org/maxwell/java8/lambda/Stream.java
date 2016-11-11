package org.maxwell.java8.lambda;

import java.util.Arrays;
import java.util.List;

public class Stream {

	public static void main(String[] args) {
		// Old way:
		List<Integer> oldList = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
		int sum = 0;
		for (Integer n : oldList) {
			int x = n * n;
			sum = sum + x;
		}
		System.out.println(sum);

		// New way:
		List<Integer> newList = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
		int number = newList.stream().map(x -> x * x).reduce((x, y) -> x + y).get();
		System.out.println(number);
	}

}
