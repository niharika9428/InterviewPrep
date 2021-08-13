package com.strings;

public class PrintAllSubstrings {

	public static void printAllSubstrings(String str) {

		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j <= str.length(); j++) {
				System.out.println(str.substring(i, j));
			}
		}
	}

	public static void printAllSubstringsWithoutUsingInBuiltFunction(String str) {

		for (int length = 1; length <= str.length(); length++) {
			for (int start = 0; start <= str.length() - length; start++) {
				int end = start + length - 1;
				for (int index = start; index <= end; index++) {
					System.out.print(str.charAt(index));
				}
				System.out.println("");
			}
		}

	}

	public static void main(String[] args) {
		String str = "abc";
		printAllSubstrings(str);
		System.out.println("==========================");
		printAllSubstringsWithoutUsingInBuiltFunction(str);

	}
}
