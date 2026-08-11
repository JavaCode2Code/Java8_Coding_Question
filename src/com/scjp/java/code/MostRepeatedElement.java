package com.scjp.java.code;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/*
Find the most repeated element in an array
*/
public class MostRepeatedElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArr = { 12, 3, 45, 13,6,43, 4, 5, 44, 51, 23, 34, 6, 23, 78, 82, 32, 58, 65, 45 };
		Function<Map<Integer, Long>, Integer> mapFun = integerLongMap -> integerLongMap.entrySet().stream()
				.max(Map.Entry.comparingByValue()).map(Map.Entry::getKey).orElse(Integer.MAX_VALUE);
		
		Integer mostRepeated=Arrays.stream(intArr).boxed()
				.collect(Collectors.collectingAndThen
						(Collectors.groupingBy(Function.identity(), Collectors.counting()),mapFun));
		System.out.println(mostRepeated);
	}

}
