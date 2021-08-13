package com.questions;

import java.util.ArrayList;
import java.util.List;

public class PowerSet {

	public static List<List<Integer>> getAllSubsets(int nums[]) {
		List<List<Integer>> subsets = new ArrayList<>();
		generateSubSets(0, nums, new ArrayList<>(), subsets);
		return subsets;

	}

	public static void generateSubSets(int index, int[] nums, List<Integer> current, List<List<Integer>> subsets) {
		subsets.add(new ArrayList<>(current));
		for (int i = index; i < nums.length; i++) {
			current.add(nums[i]);
			generateSubSets(i + 1, nums, current, subsets);
			current.remove(current.size() - 1);
		}

	}

	public static void main(String[] args) {
            int nums[] = {1,2,3};
            System.out.println(getAllSubsets(nums));
	}
}
