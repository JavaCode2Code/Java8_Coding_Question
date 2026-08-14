package com.leedCode;

import java.util.HashSet;
import java.util.Set;

public class Problem2 {

	public static int singleNum(int[] nums) {
		if(nums.length==1) 
			return nums[0];
		Set<Integer> set= new HashSet<>();
		for(int i=0;i<nums.length;i++) {
		if(set.contains(nums[i]))
		{
			set.remove(nums[i]);
		}
		else {
			set.add(nums[i]);
		}
		}
		return set.iterator().next();
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={1,2,1,2,4};
 int n=singleNum(arr);
 System.out.println("Single:"+n);
	}

}
