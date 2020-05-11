package com.codebase.leetcodeMay;

public class Day9 {

	public static void main(String[] args) {
		//System.out.println(isPerfectSquare(256));
		System.out.println((int)Math.floor(-2147483648/-1));
		int dividend=Integer.MIN_VALUE;
		int divisor = -1;
		if(dividend == Integer.MIN_VALUE)
            System.out.println("1st"+Integer.MAX_VALUE);
		else
			System.out.println((int)Math.floor(dividend/divisor));
	}

	public static boolean isPerfectSquare(int num) {
		double sq = Math.sqrt(num);
		
		return ((sq-Math.floor(sq)==0));

	}

}
