package com.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeOverLappingIntervals {

	public static int[][] merge(int[][] intervals) {
        List<int []> result = new ArrayList<>();
        
        if(intervals == null || intervals.length == 0) {
        	return result.toArray(new int[0][]);
        }
        Arrays.sort(intervals,(a,b) -> a[0]-b[0]);
        
        int start = intervals[0][0];
        int end = intervals[0][1];
        
        for (int[] i : intervals) {
			if(i[0] <= end) {
				end = Math.max(i[1], end);
			}else {
				result.add(new int[]{start,end});
				start = i[0];
				end = i[1];
			}
		}
        result.add(new int[]{start,end});
        return result.toArray(new int[0][]);
    }
	
	public static void main(String[] args) {
		int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
		
		print(intervals);
		System.out.println(" ");
		intervals = merge(intervals);
		System.out.println("Merged");
		print(intervals);
		System.out.println(" ");
		
	}
	
	public static void print(int[][] intervals) {
		for (int[] i : intervals) {
			System.out.print("["+i[0]+","+i[1]+"] ");
		}
		
	}
	
}
