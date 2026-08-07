package com.scjp.java.code;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/*Find the frequency of each character in a string using Java 8 streams api
*/
public class FrequencyEachCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String name="SpringBoot";
Map<String,Long> map=Arrays.stream(name.toLowerCase().split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
System.out.println(map);


	}

}
