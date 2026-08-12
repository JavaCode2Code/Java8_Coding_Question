package com.scjp.java.code;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
 Extract unique matching strings from String array
*/
public class Unique_Matching_SringsArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] aiStr = new String[] { "Artificial #Intelligence", "or #AI, is a #branch of #computer #science",
				"that defines as #machines and #computers performing tasks", "that normally need #human smarts",
				"like learning, reasoning, and #solving problems" };
List<String> uniqueList=Arrays.stream(aiStr).flatMap(line->Arrays.stream(line.split(" "))).
filter(str->str.startsWith("#")).map(strr->"#"+strr.substring(1).
		replaceAll("^\\W|\\W+$", "")).distinct().collect(Collectors.toList());
System.out.println(uniqueList);
	}

}
