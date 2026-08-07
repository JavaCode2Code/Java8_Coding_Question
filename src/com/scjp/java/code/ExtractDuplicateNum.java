package com.scjp.java.code;

import java.util.List;
import java.util.stream.Collectors;

/*Remove duplicate elements from a list using Java 8 streams api
*/
public class ExtractDuplicateNum {
private static void extractDuplicateNum() {
	List<Integer> list=List.of(1,2,4,5,2,5,6,55,76,34,78,34,6);
List<Integer> uniqiueList=	list.stream().distinct().collect(Collectors.toList());
System.out.println(uniqiueList);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		extractDuplicateNum();

	}

}
