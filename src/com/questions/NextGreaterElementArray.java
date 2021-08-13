package com.questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class NextGreaterElementArray {

	//O(n2)
	public static int[] nextGreaterElement_brute(int arr[]) {
		int res[] = new int[arr.length];
		Arrays.fill(res, -1);
		int element;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(res[i] == -1 && arr[i]<arr[j]) {
					res[i]=arr[j];
				}
			}
		}
		return res;
	}
	//O(n) - time and space
	public static int[] nextGreaterElement(int arr[]) {
		int res[] = new int[arr.length];
		Stack<Integer> stack = new Stack<>();
		stack.push(0);
		for (int i = 1; i < arr.length; i++) {
			if(arr[stack.peek()] > arr[i]) {
				stack.push(i);
			}else {
				while(!stack.isEmpty() && arr[stack.peek()]<arr[i]) {
					res[stack.pop()]=arr[i];
				}
				stack.push(i);
			}
		}
		while(!stack.isEmpty()) {
			res[stack.pop()] = -1;
		}
		return res;
	}
	
	public static int[] findNextGreater(List<Integer> arr) {
		int[] res = new int[arr.size()];
		Stack<Integer> stack = new Stack<>();
		stack.push(0);
		for (int i = 1; i < arr.size(); i++) {
			if(arr.get(stack.peek()) > arr.get(i)) {
				stack.push(i);
			}else {
				while(!stack.isEmpty() && arr.get(stack.peek()) < arr.get(i)) {
					  res[stack.pop()] = arr.get(i);
				}
				stack.push(i);
			}
		}
		while(!stack.isEmpty()) {
			res[stack.pop()] = -1;
		}
		return res;
		
    }	
	
	public static void main(String[] args) {
		//int arr[]= {13,7,6,12,10};
		//int arr[]= {1, 2, 3, 4, 5};
		int arr[]= {12, 1, 0, 17, 10};
		//arr = nextGreaterElement_brute(arr);
		arr=nextGreaterElement(arr);
		for (int i : arr) {
			System.out.print(i+" ");
		}
		
		List<Integer> res =Arrays.asList(12, 1, 0, 17, 10);
		
		arr = findNextGreater(res);
		System.out.println("next");
		for (int i : arr) {
			System.out.print(i+" ");
		}
		
	}
}
