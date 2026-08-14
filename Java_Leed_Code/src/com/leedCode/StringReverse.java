package com.leedCode;

/*
 * 
Reverse String
Write a function that reverses a string represented as an array of characters s. The reversal should be done in-place with O(1) extra memory.

Example:
Input: s = ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]

*/
public class StringReverse {

	public static char[] reverseString(char[] s) {
		int left=0,right=s.length-1;
		while(left<=right) {
			char temp=s[left];
			s[left]=s[right];
			s[right]=temp;
			left++;
			right--;
		}
		return s;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(reverseString(new char[] {'h','e','l','l','o'}));
	}

}
