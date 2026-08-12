package com.scjp.java.code;

import java.util.Arrays;
import java.util.List;

/*Find strings in a list that start with a number
*/
public class StringStartWithNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String [] strAr= {"rohit","Rohan","1rahul","Sumit","3Sonu","Ranu","7Brajesh","Anish"};
System.out.println(Arrays.toString(strAr));
List<String> listStr=Arrays.stream(strAr).filter(word->Character.isDigit(word.charAt(0))).toList();
System.out.println(listStr);
	}

}
