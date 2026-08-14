package com.leedCode;

import java.util.ArrayList;
import java.util.List;

public class Problem1 {

	public static List<String> fizzBuzz(int n){
		List<String> list=new ArrayList<>();
		for(int curr=1;curr<=n; curr++ ) {
			if(curr%3==0 && curr%5==0 ) {
			list.add("FIZBUZZ")	;
			}
			else if(curr%3==0) {
				list.add("FIZz")	;
				}
			else if(curr%5==0 ) {
				list.add("BUZZ")	;
				}
			else {
				list.add(curr +"");
			}
		}
		return list;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<String> result= fizzBuzz(15);
System.out.println(result);
	}

}
