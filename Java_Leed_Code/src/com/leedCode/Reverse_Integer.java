package com.leedCode;

/*
 Reverse Integer
Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.



Assume the environment does not allow you to store 64-bit integers (signed or unsigned).



Example 1:

Input: x = 123

Output: 321



Example 2:

Input: x = -123

Output: -321



Example 3:

Input: x = 120

Output: 21
*/

public class Reverse_Integer {
	public static int reverseInteger(int x) {
		int max=Integer.MAX_VALUE;//  2,147,483,647
		int min=Integer.MIN_VALUE;//- 2,147,483,648
		if(x==max || x==min)
			return 0;
		int reverse=0;
		while(x!=0) {
			int lastDigit=x%10;// getting last digit
			if(reverse>max/10)return 0;
			if(reverse<min/10) return 0;
			reverse=reverse*10+lastDigit;
			x=x/10;
		}
		return reverse;
	}
	public static void main(String[] args) {
		System.out.println(reverseInteger(-2147483640));
	}
	
	
	
	
	
	
	
	
	
	
	
}
