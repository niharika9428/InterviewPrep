package com.strings;

import java.util.Arrays;
import java.util.Scanner;

public class Permutations {
	
	public boolean checkPermuations(String firsString, String secString) {
		if(firsString.length() != secString.length()) return false;
		
		char[] sortedFirstStrArr = firsString.toCharArray();
		Arrays.sort(sortedFirstStrArr);
		char[] sortedSecStrArr = secString.toCharArray();
		Arrays.sort(sortedSecStrArr);
		firsString = new String(sortedFirstStrArr);
		secString = new String(sortedSecStrArr);
		
		if(!firsString.equalsIgnoreCase(secString))
			return false;
		
		return true;
	}
	
	//count the chars and check the count

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the strings to be checked for permutation");
		String firstStr = sc.nextLine();
		String secondStr = sc.nextLine();
		sc.close();
		Permutations p = new Permutations();
		System.out.println("Check Permutations : "+p.checkPermuations(firstStr, secondStr));
	}
}
