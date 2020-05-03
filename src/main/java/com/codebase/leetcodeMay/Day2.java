package com.codebase.leetcodeMay;

public class Day2 {

	public static void main(String[] args) {

		String J = "aA", S = "aAAbbbb"; //output-3
		//String J = "z", S = "ZZ"; //output-0
		System.out.println(numJewelsInStones(J, S));
	}
	
	public static int numJewelsInStones(String J, String S) {
        int count = 0;
        for(int i =0; i<S.length(); i++){
            if(J.indexOf(S.charAt(i)) !=-1){
                count++;
            }
        }
        return count;
    }

}
