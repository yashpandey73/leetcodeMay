package com.codebase.leetcodeMay;

public class Day4 {

	public static void main(String[] args) {

		System.out.println(findComplement(6));
	}

	public static int findComplement(int n) {
        int number_of_bits = (int)(Math.floor(Math.log(n) /  Math.log(2))) + 1; 
  
        return ((1 << number_of_bits) - 1) ^ n; 
	}
}
