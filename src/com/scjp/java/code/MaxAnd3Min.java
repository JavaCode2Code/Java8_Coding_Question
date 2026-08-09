package com.scjp.java.code;

import java.util.List;
import java.util.stream.Collectors;

/*Get the three maximum and three minimum numbers from a given list of integers
*/
public class MaxAnd3Min {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=List.of(1,3,4,5,67,23,22,34,5,6,7,12,13,56,67,45,87,68,68);
		List<Integer> sortMin=list.stream().sorted(Integer::compareTo).limit(3).collect(Collectors.toList());
		System.out.println("Minimum 3 Num "+sortMin);
	List<Integer> maxSort=	list.stream().sorted((x,y)->Integer.compare(y, x)).limit(3).collect(Collectors.toList());
System.out.println("Maximum 3 "+maxSort);
	}

}
