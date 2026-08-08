package com.scjp.java.code;

import java.util.List;
import java.util.stream.Collectors;

/*
 
 Print the numbers from a given list of integers that are multiples of 5
 
 
*/
public class Show5MultiplyOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Integer>list=List.of(11,101,3,13,15,161,7,55,25,77,78,90);
List<Integer> result= list.stream().filter(x->x%5==0).collect(Collectors.toList());
System.out.println(result);
	}

}
