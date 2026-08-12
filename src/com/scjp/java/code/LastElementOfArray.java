package com.scjp.java.code;

import java.util.Arrays;

/*Get the last element of an array
*/

public class LastElementOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] arr= {1,2,3,4,5,6,7,8,9,10,11,12,12,1,3,1,41};
Integer last=Arrays.stream(arr).boxed().reduce((first,second)->second).orElse(-1);
	
	System.out.println("Last Element: "+last);
	}

}
