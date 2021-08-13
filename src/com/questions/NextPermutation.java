package com.questions;

public class NextPermutation {

	public static void nextPermutaion(int arr[]) {
		int i = arr.length - 2;

		while (i >= 0 && arr[i] > arr[i + 1])
			i--;
		if (i >= 0) {
			int j = arr.length - 1;
			while (j >= 0 && arr[i] >= arr[j])
				j--;
			swap(arr, i, j);
		}
		reverse(arr, i + 1, arr.length - 1);
	}

	public static void reverse(int arr[], int i, int j) {
		while (i <= j) {
			swap(arr, i, j);
			i++;
			j--;
		}
	}

	public static void swap(int arr[], int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void main(String[] args) {
		int arr[] = { 1, 3, 5, 4, 2 };
		// swap(arr,1,3);
		// reverse(arr, 2, arr.length-1);
		nextPermutaion(arr);
		for (int i : arr) {
			System.out.print(i + " ");
		}

	}
}
