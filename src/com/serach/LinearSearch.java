package com.serach;

import java.util.Scanner;
//The Scanner class is used to get user input, and it is found in the java.util package.
//O(n)
public class LinearSearch {

	public static int search(int nums[], int number) {
		for (int i = 0; i < nums.length; i++) {
               if(nums[i]==number)
            	   return i;
		}
		return -1;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number you wanna search");
		int number = sc.nextInt();
		sc.close();
		int[] nums = { 10, 23, 15, 34, 67, 11 };
		int index = search(nums, number);
		if (index != -1)
			System.out.println("Number found at " + (index+1) + " position");
		else
			System.out.println("Not Found");

	}

}
