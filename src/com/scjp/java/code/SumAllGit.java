package com.scjp.java.code;

/*
 
  
  Find the second largest number in an integer array
  
  
*/import java.util.Arrays;
import java.util.List;

public class SumAllGit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr= {1,3,2,4,6,12,87,13,14,15,17,16};
int sum=Arrays.stream(arr).sum();
//System.out.println(sum);
List<Integer> list=List.of(12,14,16,77,11,2,4,88);
System.out.println("Sum: "+list.stream().mapToInt(Integer::intValue).sum());

	}

}
