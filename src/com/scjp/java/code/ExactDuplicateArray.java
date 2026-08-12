package com.scjp.java.code;

import java.util.List;
import java.util.stream.Collectors;

/*
  
 Extract duplicate elements from an array
 
*/public class ExactDuplicateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Integer> list=List.of(1,2,2,3,2,3,5,7,18,9,10,22,88,38,33);
List<Integer>list2=list.stream().filter(element->list.indexOf(element)!=list.lastIndexOf(element)).
distinct().collect(Collectors.toList());
System.out.println(list2);

	}

}
