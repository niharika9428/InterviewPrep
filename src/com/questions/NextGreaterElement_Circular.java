package com.questions;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement_Circular {

	public static void main(String[] args) {
		int nums[] = { 1, 2, 1 };
		int result[] = nextGreaterElement(nums);
		for (int i : result) {
			System.out.println(i);
		}
	}

	private static int[] nextGreaterElement(int[] nums) {
		Stack<Integer> st = new Stack();
		int n = nums.length;
		int result[] = new int[n];
		Arrays.fill(result,-1);
		for (int i = 0; i < n * 2; i++) {
			while (!st.isEmpty() && nums[st.peek()] < nums[i % n]) {
				result[st.peek()] = nums[i % n];
			}
			if (i < n)
				st.push(i);
		}

		return result;
	}
}
