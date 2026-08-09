package com.scjp.java.code;

import java.util.Arrays;
import java.util.stream.IntStream;

/*Merge two unsorted arrays into a single sorted array using Java 8 streams
*/
public class MergeSortTwoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] intarr1= {12,4,67,72,33,24,23,35,6,7,8,89};
int[] intarr2= {13,12,14,16,32,45,12,22,33,11,56,6};
int [] sortedArry=IntStream.concat(Arrays.stream(intarr1), Arrays.stream(intarr2)).sorted().toArray();
System.out.println("Sorted Array "+Arrays.toString(sortedArry));
	}

}
