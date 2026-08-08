package com.scjp.java.code;

import java.util.List;
import java.util.stream.Collectors;

/*
 
  Join a list of strings with '[' as prefix, ']' as suffix, and ',' as delimiter


*/
public class JoinListOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<String> list=List.of("Java","C","C#","Scall","Groovy","Kotilin","Python","NodeJs");
System.out.println("before Join " +list);
//String str=list.stream().collect(Collectors.joining(",","[","]"));

//String str=list.stream().collect(Collectors.joining());
//String str=list.stream().collect(Collectors.joining("-"));
String str=list.stream().collect(Collectors.joining("_","[","]"));
System.out.println(str);

	}

}
