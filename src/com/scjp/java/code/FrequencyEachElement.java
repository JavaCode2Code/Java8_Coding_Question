package com.scjp.java.code;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/*
 
Find the frequency of each element in an array or a list

*/
public class FrequencyEachElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> nameList = List.of("Rakesh", "Brajesh", "Manoj", "Ashutosh", "Manoj", "Manoj", "Ashutosh",
				"Prasanjit", "Trilochan", "Rakesh", "Rakesh", "Manoj");

		Map<String, Long> nameMap = nameList.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		System.out.println(nameMap);
	}

}
