package com.questions;

import java.util.Scanner;
import java.util.Stack;

public class ReverseString {

	
	public String reverseUsingStack(String input) {
		
		Stack stack = new Stack<>();
		for (int i = 0; i < input.length(); i++) {
			stack.push(input.charAt(i));
		}
		char[] rev = new char[input.length()];
		int i =0;
		while(!stack.isEmpty()) {
			rev[i++]=(char) stack.pop();
		}
		return new String(rev);
	}
	
	public String reverse(String input) {
		
		char[] charArr = input.toCharArray();
		int i=0,j=charArr.length-1;
		char temp;
		while(i<j) {
			temp = charArr[i];
			charArr[i]= charArr[j];
			charArr[j]= temp;
			i++;
			j--;
		}
		return new String(charArr);
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string to be reversed");
		String input = sc.nextLine();
		sc.close();
		ReverseString rc = new ReverseString();
		System.out.println("Reverse String is : "+rc.reverseUsingStack(input) );
		System.out.println("Reverse String is : "+rc.reverse(input) );
	}
	
}
