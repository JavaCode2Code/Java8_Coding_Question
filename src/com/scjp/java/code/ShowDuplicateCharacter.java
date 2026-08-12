package com.scjp.java.code;

import java.util.Arrays;
import java.util.stream.Collectors;

/*Print duplicate characters in a string
*/
public class ShowDuplicateCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String word="Sattishs";
System.out.println(Arrays.stream(word.split("")).
		filter(str->word.indexOf(str)!=word.lastIndexOf(str)).map(str->str.charAt(0)).collect(Collectors.toList()));
	}

}
