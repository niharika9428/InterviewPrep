package com.arrays;

//Merge two sorted arrays in O(1) space 
public class MergeSortedArrays {

	public static void main(String[] args) {
		
		int[] a1 = {1,4,7,8,10,36,45,50};
		int[] a2 = {2,3,9,23,24,25};
		
		int len1 = a1.length;
		int len2 = a2.length;
		int[] temp;
		//swap arrays.
		if(len2>len1) {
			temp = a1;
			a1 = a2;
			a2 = temp;
		}
		System.out.println("Before merging");
		
		print(a1);
		print(a2);
		
		System.out.println("After merging");
		merge(a1,a2);
		print(a1);
		print(a2);
		
		
	}
	
	private static void merge(int a1[],int a2[]) {
		int temp;
		int j =0;
		for (int i = 0; i < a1.length; i++) {
			if(a1[i] > a2[j]) {
				temp = a1[i];
				a1[i]= a2[j];
				a2[j]=temp;
				if(!sort(a2)) {
					j++;
				}
			}
		}
	}
	
	private static boolean sort(int nums[]) {
		boolean isSorted= false;
		//print(nums);
		int temp=0;
		for (int i = 0; i < nums.length-1; i++) {
			if(nums[i] > nums[i+1]) {
				temp = nums[i];
				nums[i]= nums[i+1];
				nums[i+1]=temp;
				isSorted = true;
			}
		}
		return isSorted;
	}
	
	private static void print(int numbers[]) {
		System.out.println(" ");
		for (int i : numbers) {
			System.out.print(" "+i+" ");
		}
		System.out.println(" ");
	}
}
