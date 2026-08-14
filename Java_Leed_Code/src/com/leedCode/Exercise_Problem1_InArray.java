package com.leedCode;

import java.util.Arrays;

public class Exercise_Problem1_InArray {
	/*
	FizzBuzz
Given a positive integer n, generate a list of strings representing numbers from 1 to n.

For each number i in this range:

If i is divisible by both 3 and 5, add "FizzBuzz" to the list.

If i is divisible by only 3, add "Fizz".

If i is divisible by only 5, add "Buzz".

Otherwise, add the number i converted to a string.

Return the final list.



Example 1:

Input: n = 6

Output:
["1","2","Fizz","4","Buzz","Fizz"]



Example 2:

Input: n = 10

Output:
["1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz"]



Example 3:

Input: n = 20

Output:

["1","2","Fizz","4","Buzz", "Fizz","7","8","Fizz","Buzz", "11","Fizz","13","14","FizzBuzz", "16","17","Fizz","19","Buzz"]
	
 */
	public static String[] fizzBuzz(int n) {
        // write your code here
        String[] arr= new String[n];
        for(int i =1;i<=n;i++)
        {
            if(i%3==0 && i%5==0 ) {
                arr[i-1]="FizzBuzz";
		
			}
			else if(i%3==0) {
                arr[i-1]="Fizz";
		
			}
			else  if(i%5==0 ) {
                arr[i-1]="Buzz";
		
			}
			else {
			    arr[i-1]=String.valueOf(i); 
			}
        }
        return arr;
    }
    public static void main(String[] args) {
		String[] res=fizzBuzz(15);
		System.out.println(Arrays.asList(res));
	}
}
// TC: O(n), SC: O(n)