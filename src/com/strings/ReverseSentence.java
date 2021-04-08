package com.strings;

import java.util.Stack;

// Reverse words of a sentence without using split or any other in built functions.
public class ReverseSentence {

	public static void main(String[] args) {
		String str = "Bangalore is my city";
		Stack<String> stack = new Stack<String>();
		
		StringBuilder builder = new StringBuilder();
		for(char c : str.toCharArray()) {
			builder.append(c);
			if(c == ' ') {
                 stack.push(builder.toString());
                 builder = new StringBuilder();
			}
		}
		builder.append(' ');
		stack.push(builder.toString());
		builder = new StringBuilder();
		while(!stack.isEmpty()) {
			builder.append(stack.pop());
		}
		
		System.out.println("Reversed Sentence of  ' "+str +" ' is :");
		System.out.println(builder.toString()) ;

	}
}
