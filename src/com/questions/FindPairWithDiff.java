package com.questions;

import java.util.HashMap;
import java.util.Map;

public class FindPairWithDiff {

	
	public static void main(String[] args) {
		int nums[] = {5, 20, 3, 2, 50, 80};
		// int nums[]= {2,11,15};
		int target = 78;

		Map<Integer, Integer> map = new HashMap<>();
		int j = -1, k = -1;
		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(target + nums[i])) {
				k = map.get(target + nums[i]);
				j = i;
				break;
			} else {
				map.put(nums[i], i);
			}
		}
		if (j != -1 && k != -1) {
			System.out.println(k + "," + j);
			System.out.println("Pair is "+nums[j]+","+nums[k]);
		} else {
			System.out.println("Pair does not exist");
		}

	}
	
}
