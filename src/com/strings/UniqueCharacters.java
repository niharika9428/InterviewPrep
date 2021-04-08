package com.strings;

import java.util.Arrays;
import java.util.Scanner;

//Determine if a string has all Unique Characters
public class UniqueCharacters {

	//brute force O(n2)
	public boolean hasDuplicateChars(String input) {
		for (int i = 0; i < input.length(); i++) {
			for (int j = i+1; j < input.length(); j++) {
				if(input.charAt(i)==input.charAt(j)) {
					return true;
				}
			}
		}
		return false;
	}
	
	//you can use set or a has map and when you put and it already contains 
	//then not unique or in the map the count is
	//already one.
	// This one is with the array of character.
	//O(n)
	public boolean hasUniqueChars(String input) {
		int MAX_CHAR = 256;
		if(input.length() > MAX_CHAR) return false;
		
		boolean[] characters = new boolean[MAX_CHAR];
		Arrays.fill(characters, false);
	    int index=0;
		for (int i = 0; i < input.length(); i++) {
			 index = (int)input.charAt(i);
			 if(characters[index])
				 return false;
			 
			characters[index]=true;
		}
		return true;
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string to be checked for unique characters");
		String input = sc.nextLine();
		sc.close();
		UniqueCharacters uc = new UniqueCharacters();
		if(uc.hasDuplicateChars(input)) {
			System.out.println("Does dont have all unique characters");
		}else {
			System.out.println("Has all unique characters");
		}
		
		System.out.println("Is UNIQUE : "+uc.hasUniqueChars(input));
		int index = input.charAt(3);
		System.out.println(index);
		
	}
}
