package com.scjp.java.code;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
 
  Generate the Fibonacci series
  
*/
public class GenerateFibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Stream.iterate(new int[] {0,1}, t->new int[]
		 * {t[1],t[0]+t[1]}).limit(10).map(t->t[0]).forEach(System.out:: print);
		 */	
	Function<int[],List<Integer>> intArrayToListOfInt=array->Arrays.stream(array).
			boxed().collect(Collectors.toList());
	List<Integer> collect=Stream.iterate(new int[] {0,1},
			t->new int[]{t[1],t[0]+t[1]}).limit(10).map(intArrayToListOfInt).
			flatMap(List::stream).distinct().collect(Collectors.toList());
	System.out.println(collect);
	}

}
