package com.questions;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class NextGreaterElement {

	
	
	public static void main(String[] args) {
		int nums1[]= {4,1,2};
		int nums2[]= {1,3,4,2};
		int result[] = nextGreaterElement(nums1,nums2);
		for (int i : result) {
			System.out.println(i);
		}
	}

	private static int[] nextGreaterElement(int[] nums1, int[] nums2) {
		Map<Integer,Integer> map = new HashMap();
		Stack<Integer> st = new Stack();
		
		for (Integer num : nums2) {
			while(!st.isEmpty() && st.peek()< num) {
				map.put(st.pop(), num);
			}
			st.push(num);
		}
		for (int i = 0; i < nums1.length; i++) {
			nums1[i] = map.getOrDefault(nums1[i],-1);
		}
		
		
		return nums1;
	}
}
