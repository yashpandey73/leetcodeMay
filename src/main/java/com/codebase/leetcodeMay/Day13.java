package com.codebase.leetcodeMay;

import java.util.*;

public class Day13 {

	public static void main(String[] args) {
		String num = "112";
		int k = 1;
		System.out.println(removeKdigits(num, k));

	}

	public static String removeKdigits(String num, int k) {
		int len = num.length();

		Stack<Character> st = new Stack<>();

		for (int i = 0; i < num.length(); i++) {
			while (!st.empty() && k>0 && st.peek()>num.charAt(i)) {
				st.pop();
				k--;
			}
			if ( num.charAt(i)=='0' && st.empty()) {
				continue;
			}else {
				st.push(num.charAt(i));
			}
		}
		
		while (!st.empty() && k>0) {
			st.pop();k--;
		}
		if (st.empty()) {
			return "0";
		}
		StringBuffer sb = new StringBuffer();
		while (!st.empty()) {
			sb.append(st.pop());
			
		}
		return sb.reverse().toString();
	}

}
