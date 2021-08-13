package com.questions;

import java.util.Arrays;
//Min conf room.
public class MinimumPlatforms {

	public static int neededPlatforms(int arr[], int dep[]) {
		if (null == arr || null == dep)
			return -1;
		int platNeeded = 1, result = 1;
		Arrays.sort(arr);
		Arrays.sort(dep);

		int n = arr.length;
		int i = 1, j = 0;
		while (i < n && j < n) {
			if (arr[i] <= dep[j]) {
				platNeeded++;
				i++;
			} else if (arr[i] > dep[j]) {
				platNeeded--;
				j++;
			}

			if (platNeeded > result)
				result = platNeeded;

		}

		return result;
	}

	public static void main(String[] args) {
//
//		int arr[] = { 900, 940, 950, 1100, 1500, 1800 };
//		int dep[] = { 910, 1200, 1120, 1130, 1900, 2000 };

		int arr[] = {7,2};
		int dep[] = {10,4};
		
		System.out.println("Minimum Number of Platforms Required = " + neededPlatforms(arr, dep));
		
		//just instead of counting if ever start[i+1] < end[i] -> false -> you cannot attend all meetings
		//min conf room can also be solved using min heap.
	}
}
