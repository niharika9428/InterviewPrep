package com.strings;

public class PrintAllPermutaions {

	public static void main(String[] args) {
		String str = "abc";
		permute(str, 0, str.length() - 1);
	}

	public static void permute(String str, int left, int right) {

		if (left == right) {
			System.out.println(str);
		} else {

			for (int i = left; i <= right; i++) {
				str = swap(str, left, i);
				permute(str, left + 1, right);
				str = swap(str, left, i);
			}
		}
	}

	public static String swap(String str, int i, int j) {

		char[] a = str.toCharArray();

		char c = a[i];
		a[i] = a[j];
		a[j] = c;

		return String.valueOf(a);
	}

}
