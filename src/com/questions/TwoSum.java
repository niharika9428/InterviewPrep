package com.questions;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	// Brute O(n2)
	// Taking one and searching in the rest for target-num

	// O(N) - time and O(N) - Space
	public static void main(String[] args) {
		int nums[] = { 2, 7, 11, 15 };
		// int nums[]= {2,11,15};
		int target = 9;

		Map<Integer, Integer> map = new HashMap<>();
		int j = -1, k = -1;
		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(target - nums[i])) {
				k = map.get(target - nums[i]);
				j = i;
				break;
			} else {
				map.put(nums[i], i);
			}
		}
		if (j != -1 && k != -1) {
			System.out.println(k + "," + j);
		} else {
			System.out.println("Pair does not exist");
		}

	}

}
