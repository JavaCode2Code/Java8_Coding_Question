package com.scjp.java.code;

import java.util.stream.IntStream;

/*Find the sum of the first 10 natural numbers
*/
public class Sum10NatualNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int result=IntStream.range(1, 10).sum();
System.out.println(result);
	}

}
