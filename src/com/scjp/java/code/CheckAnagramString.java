package com.scjp.java.code;

import java.util.Arrays;
import java.util.stream.Collectors;

/*
 
 Check if two strings are anagrams or not using Java 8 streams
 
*/
public class CheckAnagramString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Silent";
		String str2 = "listen";
		String join1 = Arrays.stream(str1.toLowerCase().split("")).sorted().collect(Collectors.joining());
		String join2 = Arrays.stream(str2.toLowerCase().split("")).sorted().collect(Collectors.joining());
		//System.out.println("Anangram:" + join1.equals(join2));
		
		//2nd way
		char[] str3 = "anagram".toCharArray();
		char[] str4 = "nagaram".toCharArray();
		Arrays.sort(str3);
		Arrays.sort(str4);
		if(Arrays.equals(str3,str4)) {
			System.out.println("is a anagram");
		}
		else {
			System.out.println("is not a anagram");
		}
		
	}

}
