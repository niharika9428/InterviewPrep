package com.questions;

import java.util.Arrays;

public class PythagoreanTriplet {

	// O(n3) - Naive
	public static boolean hasTriplet(int a[]) {

		int x, y, z;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				for (int k = j + 1; k < a.length; k++) {

					x = a[i] * a[i];
					y = a[j] * a[j];
					z = a[k] * a[k];
					if (x == y + z || y == x + z || z == x + y) {
						return true;
					}

				}
			}
		}

		return false;
	}

	// O(n2) -> Using sorting
	public static boolean isTriplet(int a[]) {

		for (int i = 0; i < a.length; i++) {
			a[i] *= a[i];
		}
		Arrays.sort(a);
		for (int i = a.length - 1; i >= 2; i--) {

			int l = 0;
			int r = i - 1;
			while (l < r) {
				if (a[l] + a[r] == a[i])
					return true;

				if (a[l] + a[r] < a[i])
					l++;
				else
					r--;
			}

		}
		return false;
	}

	public static void main(String[] args) {

		int arr[] = { 3, 6, 7, 5, 4 };
		System.out.println(hasTriplet(arr));
		System.out.println(isTriplet(arr));
	}
}
