import java.util.Arrays;

public class TestMain {

//	Given an array of non-negative integers nums, you are initially positioned at the first index of the array.
//
//	Each element in the array represents your maximum jump length at that position.
//
//	Your goal is to reach the last index in the minimum number of jumps.
//
//	You can assume that you can always reach the last index.
//
//	Input: nums = [2,3,1,1,4]
//	Output: 2
//	Explanation: The minimum number of jumps to reach the last index is 2.
	// Jump 1 step from index 0 to 1, then 3 steps to the last index.
//	

//	
//	
//	2 8 1 3 1 1 5
//	0 1 2 3 4 5 6

	public static int minimumJumps(int arr[]) {
		if (null == arr)
			return -1;

		int jumps[] = new int[arr.length];
		Arrays.fill(jumps, Integer.MAX_VALUE);
		jumps[0] = 0;
		int i, j;
		for (i = 1; i < arr.length; i++) {
			for (j = 0; j < i; j++) {
				if (i <= j + arr[j]) {
					jumps[i] = Math.min(jumps[i], jumps[j] + 1);
				}

			}
		}
		return jumps[arr.length - 1];
	}

	public static void main(String[] args) {

		int arr[] = { 2, 3, 1, 1, 4 };
		System.out.println(minimumJumps(arr));
	}
}
