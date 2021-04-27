package com.questions;

public class ClosetSumInArrays {

	public static void main(String[] args) {
		int arr[] = { 14, 16, 19, 21, 46, 84, 126, 169 };
		int x = 101;
		int left = 0, right = arr.length - 1, closest_sum = 0, closest = Integer.MAX_VALUE, sum = 0;
		int i = 0, j = 0;
		while (left < right) {
			sum = arr[left] + arr[right];
			if (Math.abs(x - sum) < closest) {
				closest = Math.abs(x - sum);
				closest_sum = sum;
				i = left;
				j = right;
			}
			if (sum > x)
				right--;
			else
				left++;
		}

		System.out.println("Closest sum is " + closest_sum + " at " + i + "," + j);
	}
}
