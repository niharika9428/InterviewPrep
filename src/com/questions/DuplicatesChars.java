package com.questions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DuplicatesChars {
	
	
	//Brute is O(n2) -> going through the loop 2 times and comparing it.
    //Better is using Arrays.sort() -> O(nlogn)
	//Other is using extra DS
	//O(n) -> bit wise 

	//
	//You can use a set and when set already contains then those are the duplicates
	//you can also use hashmap.
	// to print you can get the result in arrays and count duplicates as well.
	// O(n) -> TC 
	// O(n) -> space
	public static boolean hasUniqueChars_Set(String str) {
		
		Set<Character> set = new HashSet<>();
		for (char c : str.toCharArray()) {
			if(!set.add(c)) {
				return false;
			}
		}
		return true;
	}
	
	//Using arrays.
	//This approach assumes ASCII char set(8 bits). 
	//The idea is to maintain a boolean array for the characters. 
	//The 256 indices represent 256 characters
    public static boolean hasUniqueChars_Array(String str) {
		
    	int MAX_CHAR = 256;
    	// If length is greater than 256,
        // some characters must have been repeated
        if (str.length() > MAX_CHAR)
            return false;
 
        boolean[] chars = new boolean[MAX_CHAR];
        Arrays.fill(chars, false);
 
        for (int i = 0; i < str.length(); i++) {
            int index = (int)str.charAt(i);
 
            /* If the value is already true, string
               has duplicate characters, return false */
            if (chars[index] == true)
                return false;
 
            chars[index] = true;
        }
 
        /* No duplicates encountered, return true */
        return true;
	}
	
	
	public static void main(String[] args) {
		System.out.println(hasUniqueChars_Set("hithere"));
		System.out.println(hasUniqueChars_Set("niha"));
	}
	
}
