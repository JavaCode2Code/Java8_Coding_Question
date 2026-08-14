package com.leedCode;

public class Problem3 {
	public static boolean palindrome(int x) {
		if(x<0)
			return false;
		if(x!=0 && x%10==0)
			return false;
		int revers=0;
		while(x>revers) {
			int lastDigit=x%10;
		revers=revers*10+lastDigit;
		
		x=x/10;
		System.out.println(revers +" "+x);
		}
		return (x==revers)||(x==revers/10);
	}
public static void main(String[] args) {
	System.out.println(palindrome(123213));//513124321
}
}
