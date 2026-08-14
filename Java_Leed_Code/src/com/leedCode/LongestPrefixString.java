package com.leedCode;

/*
 
  
Longest Common Prefix
Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

Example 1:

Input:
strs = ["apple", "appetite", "application"]
Output:
"app"



Example 2:

Input:
strs = ["banana", "band", "banner"]
Output:


"ban" 

*/
public class LongestPrefixString {
	public static String longPrefix(String[] str) {
		if(str.length==0)
			return "";
		String prefix=str[0];
		for(int i=1;i<str.length;i++) {
			while(str[i].indexOf(prefix)!=0) {
				prefix=prefix.substring(0,prefix.length()-1);
				System.out.println(" pref "+prefix);
			}
		}
		return prefix;
	}
public static void main(String[] args) {
	System.out.println(longPrefix(new String[] {"flower","flow","flight"}));
}
}
