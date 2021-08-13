package com.arrays;

public class MaximumProductSubArray {

	//O(n2)
	public static int maxSubarrayProduct(int nums[]) {
		if(nums.length == 0 ) return -1;
		int n = nums.length;
		int result= nums[0];
		int mul;
		for(int i = 0;i<n;i++) {
			mul = nums[i];
			for(int j = i+1;j<n;j++){
				result = Math.max(result, mul);
				mul = mul*nums[j];
			}
			result = Math.max(result, mul);
		}
		return result;
	}
	
	//O(n)
	public static int maxProduct(int nums[]) {
		if(nums.length == 0 ) return -1;
		int n = nums.length;
		int result= nums[0];
		int min = nums[0],max=nums[0];int temp;
		for(int i = 1;i<n;i++) {
			if(nums[i] < 0) {
				temp = min;
				min = max;
				max=temp;
			}
			min = Math.min(nums[i],min*nums[i]);
			max = Math.max(nums[i],max*nums[i]);
			if(max>result) {
				result  = max;
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		
        //int nums[] = {-1, -3, -10, 0, 60}; // 60
        int nums[] = {6, -3, -10, 0, 2}; // 180
        //int nums[] = {-2, -40, 0, -2, -3}; //80
        System.out.println("O n 2 Maximum Sub array product is "
                           + maxSubarrayProduct(nums));
        System.out.println("Maximum Sub array product is "
                + maxProduct(nums));
	}
}
