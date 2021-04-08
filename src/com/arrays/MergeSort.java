package com.arrays;

public class MergeSort {
//Count is for inversion count.
	public static int sort(int nums[], int l, int h) {
		int m = 0;
		int count = 0;
		if (l < h) {
			m = l + (h - l) / 2;
			count += sort(nums, l, m);
			count += sort(nums, m + 1, h);
			count += merge(nums, l, m, h);
		}
		return count;
	}

	public static int merge(int nums[], int l, int m, int h) {

		int n1 = m - l + 1;
		int n2 = h - m;
		int L[] = new int[n1];
		int R[] = new int[n2];

		for (int i = 0; i < L.length; i++) {
			L[i] = nums[l + i];
		}
		for (int i = 0; i < R.length; i++) {
			R[i] = nums[m + 1 + i];
		}

		int i = 0, j = 0, k = l;
		int count = 0;
		while (i < n1 && j < n2) {
			if (L[i] <= R[j]) {
				nums[k] = L[i];
				i++;
			} else {
				nums[k] = R[j];
				j++;
				count += n1 - i;
			}
			k++;
		}

		while (i < n1) {
			nums[k] = L[i];
			k++;
			i++;
		}
		while (j < n2) {
			nums[k] = R[j];
			k++;
			j++;
		}
		return count;
	}

	static void printArray(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	public static void main(String[] args) {
		int[] arr = { 5, 3, 2, 4, 1 };
		int count = sort(arr, 0, arr.length - 1);
		printArray(arr);
		System.out.println(count);
	}
}
