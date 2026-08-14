package com.leedCode;


/*Single Number
Given a non-empty array of integers nums, every element appears twice except one element. Find that single one.



Expected TC: O(n) and SC: O(1)



Example 1:

Input: nums = [2,2,1]

Output: 1



Example 2:

Input: nums = [4,1,2,1,2]

Output: 4



Example 3:

Input: nums = [1]

Output: 1*/

public class Exercise_Problem2_space_complexity {

	public static int singleNum(int[] nums) {
		int singleNum=0;
		for(int num:nums) {
			singleNum=singleNum^num;//XOR ^ GIVE NON REPEATING NUMBER
		}
		return singleNum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={1,2,1,2,4};
	int single=	singleNum(arr);
	System.out.println(single);
	}

}
