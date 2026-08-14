package com.leedCode;

/*Factorial Trailing Zeroes
Given an integer n, return the number of trailing zeroes in n!.



Note that n! = n * (n - 1) * (n - 2) * ... * 3 * 2 * 1



Example 1:

Input: n = 3

Output: 0

Explanation: 3! = 6, no trailing zero.



Example 2:

Input: n = 5

Output: 1

Explanation: 5! = 120, one trailing zero.



Example 3:

Input: n = 0

Output: 0


Constraints:

0 <= n <= 104


Follow up: Could you write a solution that works in logarithmic time complexity?*/

public class Problem4 {
	public static int trailingZero(int n) {
		int count = 0;
		int countPowOf = 5;
		while (n >= countPowOf) {
			count += (n /countPowOf);
			System.out.println(" countPowOf0 " +countPowOf +" count0 "+count);
			countPowOf *= 5;
			System.out.println(" countPowOf " +countPowOf +" count "+count);
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(trailingZero(125));

	}

}
