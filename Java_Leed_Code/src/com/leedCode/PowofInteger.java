package com.leedCode;

/*
 * Pow(x, n)
Implement pow(x, n), which calculates x raised to the power n (i.e., x^n).



Example 1:

Input: x = 2.00000, n = 10

Output: 1024.00000



Example 2:

Input: x = 2.10000, n = 3

Output: 9.26100



Example 3:

Input: x = 2.00000, n = -2

Output: 0.25000

Explanation: 2-2 = 1/22 = 1/4 = 0.25



*/
public class PowofInteger {

	public static double myPow(double x, int n) {
		long num = Math.abs((long) n);
		double result = 1.0;
		while (num != 0) {
			if (num % 2 == 1) { //if n is an odd number
				result = result * x;
				num = num - 1;
			}
			x = x * x;
			num = num / 2;
		}

		return n < 0 ? 1.0 / result : result;
	}

	public static void main(String[] args) {
		System.out.println(myPow(2.00000, -2));

	}
}
