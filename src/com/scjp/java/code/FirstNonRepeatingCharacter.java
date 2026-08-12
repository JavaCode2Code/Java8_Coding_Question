package com.scjp.java.code;

import java.util.Arrays;

/*Find the first repeated character in a string
*/
public class FirstNonRepeatingCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String word="Meenao";
System.out.println(Arrays.stream(word.split("")).filter(str->word.indexOf(str)==word.lastIndexOf(str)).findFirst().orElse(""));
	}

}
