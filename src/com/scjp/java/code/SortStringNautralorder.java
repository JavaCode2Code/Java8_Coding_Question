package com.scjp.java.code;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/*
 
 Sort a list of strings according to the increasing order of their length

*/
public class SortStringNautralorder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> listStr = Arrays.asList("rahul", "Mohit", "Sonu", "Ranu", "Rohit", "Rahul", "Biru", "Manoj",
				"Dinu");
		List<String> result = listStr.stream().sorted(Comparator.comparing(String::length))
				.collect(Collectors.toList());
		//with Ascending order
		/*
		 * List<String> results = listStr.stream()
		 * .sorted(Comparator.comparing(String::length).thenComparing(Comparator.
		 * naturalOrder())) .collect(Collectors.toList());
		 */

		System.out.println(result);

	}

}
