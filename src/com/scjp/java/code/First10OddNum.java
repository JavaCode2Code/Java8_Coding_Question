package com.scjp.java.code;

import java.util.List;
import java.util.stream.Collectors;

/*
 * 
 * 
  Print the first 10 odd numbers
  

*/

public class First10OddNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Integer> list=List.of(1,2,3,4,5,67,67,7,9,8,19,12,1,11,21,23,23,12,34,14,11,13,17);
List<Integer> listOdd=list.stream().filter(x->x%2!=0).limit(10).collect(Collectors.toList());
System.out.println(listOdd);
	}

}
