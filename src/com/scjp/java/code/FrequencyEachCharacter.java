package com.scjp.java.code;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/*Find the frequency of each character in a string using Java 8 streams api
*/
public class FrequencyEachCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String name="SpringBoots";
Map<String,Long> map=Arrays.stream(name.toLowerCase().split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//System.out.println(map);

/* 2nd way in map */

Map<Character,Long> maps=name.toLowerCase().chars().mapToObj(ch->(char)ch).collect(Collectors.
		groupingBy(Function.identity(),Collectors.counting()));
//System.out.println(maps);

/* 3rd way in map */

Map<String,Integer> mapInt=Arrays.stream(name.toLowerCase().split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.
		collectingAndThen(Collectors.counting(), Long::intValue)));
System.out.println(mapInt);
	}

}
