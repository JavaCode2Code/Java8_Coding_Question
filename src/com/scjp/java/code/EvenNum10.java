package com.scjp.java.code;

import java.util.List;
import java.util.stream.Collectors;

public class EvenNum10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Integer> list=List.of(1,2,3,4,5,6,7,8,11,12,13,14,16,17,22,23,24);
List<Integer> even10=list.stream().filter(x->x%2==0).limit(10).collect(Collectors.toList());
System.out.println(even10);	
	}

}
