package com.scjp.java.code;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*Separate odd and even numbers in a list of integers 
*/

public class SeperateOddAndEven {
	private static void oddAndEven() {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		Map<Boolean, List<Integer>> map = list.stream().collect(Collectors.partitioningBy(i -> i % 2 == 0));
		// System.out.println(map);
		// 2ed way

		Collection<List<Integer>> evenOddList = list.stream()
				.collect(Collectors.collectingAndThen(Collectors.partitioningBy(i -> i % 2 == 0), Map::values));
	 	System.out.println(evenOddList);
	}

	public static void main(String[] args) {
		oddAndEven();
	}
}
