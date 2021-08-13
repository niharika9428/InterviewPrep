package com.questions;

public class MaximumSumSubarray {

	// O(n)
	public static int maxSumSubarray(int[] nums) {
		int sum = 0;
		int max = nums[0];
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
			if (max < sum)
				max = sum;
			if (sum < 0)
				sum = 0;
		}

		return max;
	}

	// O(n^2)
	public static int maxSum_Brute(int[] nums) {
		int max = 0;
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			sum = 0;
			for (int j = i; j < nums.length; j++) {
				sum += nums[j];
				if (max < sum)
					max = sum;
			}
		}
		return max;
	}

	public static void main(String[] args) {
		int nums[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
		System.out.println(maxSumSubarray(nums));
		System.out.println(maxSum_Brute(nums));
	}
}
