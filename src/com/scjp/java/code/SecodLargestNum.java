package com.scjp.java.code;

/*
 
 Find the second largest number in an integer array
  
*/import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SecodLargestNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 3, 4, 6, 7, 8, 9, 11, 12 };
		int secoLarg = Arrays.stream(arr).boxed().sorted((x, y) -> y - x).skip(1).findFirst().get();
		System.out.println(secoLarg);
		
		
		List<Integer> list=List.of(12,13,16,17,21,34,78,78,65);
		Integer num=list.stream().sorted(Comparator.reverseOrder()).distinct().skip(1).findFirst().get();
		System.out.println(num);
	}

}
