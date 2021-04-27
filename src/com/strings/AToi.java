package com.strings;

public class AToi {

	public static void main(String[] args) {
		System.out.println(myAtoi("+1"));
	}

	public static int myAtoi(String s) {
		int n = s.length();
		if (n == 0)
			return 0;
		int i = 0;
		while (i < n && s.charAt(i) == ' ') {
			i++;
		}
		if (i >= n)
			return 0;
		int sign = 1;
		if (s.charAt(i) == '-' || s.charAt(i) == '+') {
			sign = (s.charAt(i) == '-') ? -1 : 1;
			i++;
		}
		long result = 0;
		while (i < n && (s.charAt(i) - '0' >= 0 && s.charAt(i) - '0' <= 9)) {
			result = result * 10 + s.charAt(i) - '0';
			if (result * sign > Integer.MAX_VALUE || result * sign < Integer.MIN_VALUE) {
				return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
			}
			i++;
		}

		result = result * sign;
		return (int) result;
	}
}
