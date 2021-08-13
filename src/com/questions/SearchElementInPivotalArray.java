package com.questions;

public class SearchElementInPivotalArray {

	public static int findPivot(int arr[], int low, int high) {

		if (high < low)
			return -1;
		if (high == low)
			return low;

		int mid = low + (high - low) / 2;

		if (mid < high && arr[mid] > arr[mid + 1]) {
			return mid;
		}

		if (mid > low && arr[mid] < arr[mid - 1]) {
			return mid - 1;
		}

		if (arr[low] >= arr[mid]) {
			return findPivot(arr, low, mid - 1);
		}
		return findPivot(arr, mid + 1, high);
	}

	public static int findElement(int arr[], int target) {

		int left = 0;
		int right = arr.length - 1;
		int mid;

		while (left <= right) {
			mid = left + (right - left) / 2;

			if (arr[mid] == target)
				return mid;
			else if (arr[mid] >= arr[left]) {
				if (target <= arr[mid] && target >= arr[left]) {
					right = mid - 1;
				} else
					left = mid + 1;
			} else {
				if (target <= arr[right] && target >= arr[mid]) {
					left = mid + 1;
				} else
					right = mid - 1;
			}
		}

		return -1;
	}

	public static void main(String[] args) {

		int[] arr = { 4, 5, 6, 7, 8, 0, 1, 2 };

		System.out.println(findPivot(arr, 0, arr.length - 1));
		System.out.println(findElement(arr, 5));
	}

}
