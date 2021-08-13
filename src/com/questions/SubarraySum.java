package com.questions;

public class SubarraySum {

	
	public static void sumSubArray(int arr[],int k) {
		
		int sum =0;
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			sum = sum+arr[i];
			if(sum<0) sum =0;
			max = Math.max(sum, max);
			
		}
	}
	
	public static void main(String[] args) {
		
	}
}
