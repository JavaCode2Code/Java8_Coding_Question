package com.scjp.java.code;

/*Find the common elements between two arrays
*/
import java.util.List;

public class CommonElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Integer> list=List.of(1,3,15,7,8,9,1,3,80);
List<Integer> list2=List.of(1,3,4,5,6,78,76,45);
List<Integer> rsult=list.stream().filter(list2::contains).toList();
System.out.println(rsult);
	}

}
