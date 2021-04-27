package com.strings;

import java.util.LinkedHashSet;

public class RemoveDuplicates {

	public static void main(String[] args) {
		System.out.println(removeDups("zvvo"));
	}
	
	 public static String removeDups(String S) {
	        LinkedHashSet<Character> set = new LinkedHashSet<>();
	        for (char c : S.toCharArray()) {
	        	if(!set.contains(c)) {
	        		set.add(c);
	        	}	
			}
	        StringBuilder build = new StringBuilder();
	        for (Character character : set) {
				build.append(character);
			}
	        return build.toString();
	        
	 }
}
