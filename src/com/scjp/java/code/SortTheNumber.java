package com.scjp.java.code;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/*Sort a given list of decimals in reverse order
*/
public class SortTheNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = List.of(12, 32, 23, 32, 45, 76, 22, 11, 66, 78, 90);
		// list.sort(Comparator.reverseOrder());
//above code throwing the java.lang.UnsupportedOperationException due Immutable List

//here (y,x) gives descending order if want ascending we have to put (x,y)
		//List<Integer> sortedList = list.stream().sorted((x, y) -> Integer.compare(y, x)).collect(Collectors.toList());
		//System.out.println(sortedList);

	
	//2nd way
		//here we have to try naturalOrder() also
	List<Integer>sortedList=	list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
	System.out.println(sortedList);
	}

}
