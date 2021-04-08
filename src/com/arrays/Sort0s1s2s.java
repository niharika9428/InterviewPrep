package com.arrays;

//Sort an array of 0's 1's & 2's | Leetcode
public class Sort0s1s2s {

	public static void main(String[] args) {
		int numbers[] = {0,1,1,2,0,0,1,2,2,1,1,0};
		print(numbers);
		sort(numbers);
		print(numbers);
	}
	//Dutch National Flag Algorithm
	private static void sort(int numbers[]) {
		int low =0,mid =0,high = numbers.length-1;
		
		while(mid<=high) {
			if(numbers[mid]==0) {
				swap(numbers,low,mid);
				low++;
				mid++;
			}else if(numbers[mid]==1) {
				mid++;
			}else if(numbers[mid]==2) {
				swap(numbers,mid,high);
				high--;
			}
		}
	}
	
	private static void swap(int[] numbers,int firstIndex, int secondIndex) {
		int temp = numbers[firstIndex];
		numbers[firstIndex]=numbers[secondIndex];
		numbers[secondIndex]=temp;
	}
	
	private static void print(int numbers[]) {
		System.out.println(" ");
		for (int i : numbers) {
			System.out.print(" "+i+" ");
		}
		System.out.println(" ");
	}
}
