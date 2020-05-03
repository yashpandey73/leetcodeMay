package com.codebase.leetcodeMay;

public class Day1 {

	public static void main(String[] args) {
		System.out.println(firstBadVersion(5));

	}
	 public static int firstBadVersion(int n) {
	        
	        int  start =1;
	        int end = n;
	        int mid;
	        int res = n;
	        
	        while(start<= end){
	            mid = start + (end-start)/2;
	            
	            if(isBadVersion(mid)){
	                res = mid;
	                end = mid -1;
	            }else{
	                start = mid+1;
	            }
	        }
	     return res;
	    }
	private static boolean isBadVersion(int mid) {
		if(mid>4)
			return true;
		
		return false;
	}
}
