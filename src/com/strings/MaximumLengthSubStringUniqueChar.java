package com.strings;

import java.util.HashMap;

//Problem 3 - Given a string, find the maximum length substring having at max k unique characters.
//eg - abcaacabcabcaa
//k=2 ans =5 (caaca)
public class MaximumLengthSubStringUniqueChar {

	public static int maxLenSubStr(String str, int k) {
		HashMap<Character, Integer> map = new HashMap<>();
		int maxLen = Integer.MIN_VALUE;
		int count = 0, i = 0;
		for (int j = 0; j < str.length(); j++) {
			if (map.containsKey(str.charAt(j))) {
				count = map.get(str.charAt(j));
				map.put(str.charAt(j), count + 1);
			} else {
				map.put(str.charAt(j), 1);
			}
			if (map.size() <= k) {
				maxLen = Math.max(maxLen, j - i + 1);
			} else {
				while (map.size() > k) {
					count = map.get(str.charAt(i));
					if (count == 1) {
						map.remove(str.charAt(i));
					} else {
						map.put(str.charAt(i), count - 1);
					}
					i++;
				}
			}

		}
		return maxLen;
	}

	public static int lengthOfLongestSubstringKDistinct(String s, int k) {
		int result = 0;
		int i = 0;
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();

		for (int j = 0; j < s.length(); j++) {
			char c = s.charAt(j);
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}

			if (map.size() <= k) {
				result = Math.max(result, j - i + 1);
			} else {
				while (map.size() > k) {
					char l = s.charAt(i);
					int count = map.get(l);
					if (count == 1) {
						map.remove(l);
					} else {
						map.put(l, map.get(l) - 1);
					}
					i++;
				}
			}

		}

		return result;
	}

	public static void main(String[] args) {
		System.out.println(maxLenSubStr("abcaacabcabcaa", 2));
		System.out.println(lengthOfLongestSubstringKDistinct("abcaacabcabcaa", 2));
	}
}
