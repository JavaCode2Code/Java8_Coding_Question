package com.scjp.java.code;

import java.util.Arrays;
import java.util.stream.IntStream;

/*
 
 Merge two unsorted arrays into a single sorted array without duplicates
 
*/
public class MergeSortUniqueElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] int1= {12,2,13,51,15,14,17,16,87,51,12};
int [] int2= {21,32,25,66,34,65,13,2,1,15,14,16,34};
int [] arr=IntStream.concat(Arrays.stream(int1), Arrays.stream(int2)).sorted().distinct().toArray();
System.out.println("Sorted Unique Num "+Arrays.toString(arr));
	}

}
