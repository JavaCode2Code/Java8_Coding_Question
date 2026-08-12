package com.scjp.java.code;

import java.util.stream.IntStream;

/*
 * 
 Check if a string is a palindrome using Java 8 streams
 
*/
public class CheckingPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="Madam";
String temp=str.replace("\\s+", "").toLowerCase();
System.out.println("is palindrome String "
+IntStream.range(0, temp.length()/2).noneMatch(i->temp.charAt(i)!=temp.charAt(temp.length()-1)));

	}

}
