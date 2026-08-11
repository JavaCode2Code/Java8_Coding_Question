package com.scjp.java.code;

/*
 
 Reverse each word of a string using Java 8 streams
 
*/
import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="Java is not Opps Language";
String revWord=Arrays.stream(str.split(" ")).map(word->new StringBuffer(word).reverse()).collect(Collectors.joining(" "));
	System.out.println(revWord);
	
	}

}
