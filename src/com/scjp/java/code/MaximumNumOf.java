package com.scjp.java.code;


import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/*
 
 Find the maximum and minimum of a list of integers
 
 
*/
public class MaximumNumOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Integer> listMax=List.of(1,2,4,5,6,12,14,23,43,54,23,6,55);
Integer max=listMax.stream().max(Integer::compareTo).orElse(Integer.MAX_VALUE);
System.out.println("Max value: " +max);
System.out.println("------------------------");

Integer min=listMax.stream().min(Integer::compareTo).orElse(Integer.MIN_VALUE);
System.out.println("Min Num: "+ min);

System.out.println("--------------------------");
IntSummaryStatistics intSummaryStatistics=listMax.stream().collect(Collectors.summarizingInt(Integer::intValue));
	System.out.println("Max:  "+intSummaryStatistics.getMax());
	System.out.println("Min:  "+intSummaryStatistics.getMin());
	System.out.println("Avg:  "+intSummaryStatistics.getAverage());
	System.out.println("Sum:  "+intSummaryStatistics.getSum());
	System.out.println("Count:  "+intSummaryStatistics.getCount());
	
}

}
