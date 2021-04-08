package com.serach;

import java.util.Scanner;
//The Scanner class is used to get user input, and it is found in the java.util package.
//O(log n)
//Sorted array
public class BInarySearch {

	public static int search(int nums[], int number) {
		int low = 0, high = nums.length-1, mid;
		while(low<=high) {
			mid = low + (high-low)/2;
			if(nums[mid]==number) return mid;
			else if(nums[mid]< number) low = mid+1;
			else if(nums[mid]>number) high= mid-1;
		}
		return -1;
	}
	
	public static int recursiveSearch(int nums[],int low,int high, int number) {
		if(low > high) return -1;
		int mid = low + (high-low)/2;
		if(nums[mid]==number) return mid;
		else if(nums[mid] < number) return recursiveSearch(nums,mid+1,high,number);
		else return recursiveSearch(nums,low,mid-1,number);
	}

	
	public static int firstOccurence(int nums[],int number) {
		int low=0,high=nums.length-1,mid = 0;
		int firstOcc = -1;
		while(low<=high) {
			mid = low + (high-low)/2;
			if(nums[mid]==number) {
				firstOcc = mid;
				high = mid -1;
			}else if(nums[mid]<number) low = mid+1;
			else high = mid-1;
		}
		return firstOcc;
	}
	
	public static int lastOccurence(int nums[],int number) {
		int low=0,high=nums.length-1,mid = 0;
		int firstOcc = -1;
		while(low<=high) {
			mid = low + (high-low)/2;
			if(nums[mid]==number) {
				firstOcc = mid;
				low = mid + 1;
			}else if(nums[mid]<number) low = mid+1;
			else high = mid-1;
		}
		return firstOcc;
	}
	
	public static int countOccurence(int nums[],int number) {
		if (search(nums, number) == -1) return 0;
		
		return (lastOccurence(nums, number)-firstOccurence(nums, number)) +1;
	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number you wanna search");
		int number = sc.nextInt();
		sc.close();
		int[] nums = { 10,10,10,11,15,34,67,110 };
		int index = firstOccurence(nums, number);
				//firstOccurence(nums, number);
				//recursiveSearch(nums,0,nums.length-1, number);
				//search(nums, number);
		if (index != -1)
			System.out.println("Number found at " + (index+1) + " position");
		else
			System.out.println("Not Found");

		int count = countOccurence(nums, number);
		System.out.println("Number of occurences "+count);
		
	}

}
