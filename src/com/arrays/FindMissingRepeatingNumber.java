package com.arrays;

import java.util.Arrays;

//Find the Missing and Repeating Number
//O(n) -> time and space
public class FindMissingRepeatingNumber {

	public static void main(String[] args) {
		int nums[]= {4,3,2,2,1,5};
		int n = nums.length;
		
		boolean visited[]= new boolean[n+1];
		Arrays.fill(visited, false);
		
		int repeatedNum=-1,missingNum=-1;
		
		for (int i : nums) {
			if(!visited[i]) {
				visited[i]=true;
			}else {
				repeatedNum = i;
			}
		}
		for (int i = 1; i <= visited.length; i++) {
			if(!visited[i]) {
				missingNum = i;
				break;
			}
		}
		
		System.out.println("Repeated Number is : "+repeatedNum);
		System.out.println("Mising Number is : "+missingNum);
	}
}
