package com.questions;


//For binary serach we needed sorted array
public class Search {
    //O(n)
	public static int linearSearch(int[] nums, int n) {

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == n)
				return i;
		}

		return -1;

	}
    //O(log n)
	public static int iterative_binsearch(int[] nums, int n) {
		int low = 0, high = nums.length - 1, mid = 0;
		while (low <= high) {
			mid = low + (high - low) / 2;
			if (nums[mid] == n)
				return mid;
			else if (nums[mid] < n) {
				low = mid + 1;
			} else if (n < nums[mid]) {
				high = mid - 1;
			}
		}
		return -1;
	}
	
	//O(log n)
	public static int recursive_binsearch(int nums[],int n , int low, int high) {
		
		if(low > high) return -1;
		
		int mid = low +(high - low)/2;
		
		if(nums[mid] == n) return mid;
		else if(nums[mid] < n) 
			return recursive_binsearch(nums,n,mid+1,high);
		else	
			return recursive_binsearch(nums,n,low,mid-1);
	}
	
	//O(log n)
	public static int firstOcc(int nums[],int n) {
		
		int low = 0 , high = nums.length-1;
		int mid =0;
		int result =-1;
		while(low <= high) {
			mid = low + (high - low)/2;
			if(nums[mid]==n) {
				result = mid;
				high = mid-1;
			}else if(nums[mid] < n) {
				low = mid+1;
			}else {
				high = mid -1;
			}
		}
		return result;
	}
	
	//O(log n)
	public static int lastOcc(int nums[],int n) {
		
		int low = 0 , high = nums.length-1;
		int mid =0;
		int result =-1;
		while(low <= high) {
			mid = low + (high - low)/2;
			if(nums[mid]==n) {
				result = mid;
				low = mid+1;
			}else if(nums[mid] < n) {
				low = mid+1;
			}else {
				high = mid -1;
			}
		}
		return result;
	}
	
	//O(log n)
	public static int countOccurence(int nums[],int n) {
		return lastOcc(nums, n) - firstOcc(nums, n)+1;
	}

	public static void main(String[] args) {

		int nums[] = { 1, 2, 2, 2, 2, 2, 7, 8, 9, 10 };
//		System.out.println(linearSearch(nums, 10));
//		System.out.println(linearSearch(nums, 12));
//		System.out.println(iterative_binsearch(nums,23));
//		System.out.println(iterative_binsearch(nums,10));
//		System.out.println(recursive_binsearch(nums,23,0,nums.length-1));
//		System.out.println(recursive_binsearch(nums,10,0,nums.length-1));
		
		System.out.println(firstOcc(nums, 2));
		System.out.println(lastOcc(nums, 2));
		System.out.println(countOccurence(nums, 2));
		
	}
}
