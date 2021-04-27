package com.strings;

//
//Your task is to implement the function strstr. The function takes two strings as arguments (s,x) and 
//locates the occurrence of the string x in the string s.
//The function returns and integer denoting the first occurrence of the string x in s (0 based indexing).
//NAIVE PATTERN SEARCH
public class ImplementStrstr {

	public static void main(String[] args) {
		System.out.println(strStr("ccdeecbdfedcbabfdfaebdaf", "fecfacbccfe"));
	}

	public static int strStr(String haystack, String needle) {

		int n = needle.length();
		int h = haystack.length();

		if (h < n)
			return -1;

		for (int i = 0; i <= (h - n); i++) {
			int j;
			for (j = 0; j < n; j++) {
				if (haystack.charAt(i + j) != needle.charAt(j)) {
					break;
				}
			}
			if (j == n) {
				return i;
			}
		}

		return -1;

	}
}
