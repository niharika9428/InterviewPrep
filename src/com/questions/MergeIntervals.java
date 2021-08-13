package com.questions;

import java.util.ArrayList;
import java.util.List;

public class MergeIntervals {

	public static List<int[]> mergeIntervals(int[][] intervals) {
		List<int[]> result = new ArrayList<int[]>();

		int start = intervals[0][0];
		int end = intervals[0][1];

		for (int[] interval : intervals) {
			if (interval[0] <= end) {
				end = Math.max(end, interval[1]);
			} else {
				result.add(new int[] { start, end });
				start = interval[0];
				end = interval[1];
			}
		}
		result.add(new int[] { start, end });
		return result;
	}

	public static void main(String[] args) {
		int[][] intervals = { { 1, 3 }, { 2, 6 }, { 8, 10 }, { 9, 9 }, { 15, 18 } };
		// int[][] intervals = { { 1, 3 }};
		List<int[]> result = mergeIntervals(intervals);
		for (int[] is : result) {
			System.out.print("{" + is[0] + "," + is[1] + "}, ");
		}
	}

}
