package com.questions;

import java.util.ArrayList;
import java.util.Arrays;

public class MeetingRoom1 {

	public static boolean canWeAttendAllMeetings(ArrayList<Interval> intervals) {

		int[] starts = new int[intervals.size()];
		int[] ends = new int[intervals.size()];

		for (int i = 0; i < intervals.size(); i++) {
			starts[i] = intervals.get(i).start;
			ends[i] = intervals.get(i).end;
		}

		Arrays.sort(starts);
		Arrays.sort(ends);

		for (int i = 0; i < starts.length - 1; i++) {
			if (starts[i + 1] < ends[i]) {
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {

		ArrayList<Interval> intervals = new ArrayList<>();
		intervals.add(new Interval(0, 30));
		intervals.add(new Interval(15, 20));
		System.out.println(canWeAttendAllMeetings(intervals));
		intervals.clear();
		intervals.add(new Interval(7, 10));
		intervals.add(new Interval(2, 4));
		System.out.println(canWeAttendAllMeetings(intervals));

	}

}

class Interval {

	int start;
	int end;

	public Interval(int start, int end) {

		this.start = start;
		this.end = end;
	}

}
