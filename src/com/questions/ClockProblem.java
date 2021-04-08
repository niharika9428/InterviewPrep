package com.questions;

import java.util.Scanner;


//O(1) -> Time Complexity
// Angle between hour and min
// Min hand travels  60 min -> 360
// min -> 6 deg
// In H hr and M min -> M*6
// Hr hand travels 12 hr -> 360 
// 1 hr -> 60 min -> 360/12
// 1 min -> 0.5 deg
// In H hr M min -> (60 * H + M)* 0.5 deg
public class ClockProblem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter hours : ");
		int h = sc.nextInt();
		System.out.println("Enter mins : ");
		int m = sc.nextInt();
		
		if(h<0 || m<0 || h>12 || m>60) {
			System.out.println("Wrong input. Enter values in 12 hr format.");
			return;
		}
		
		if(h==12) {
			h=0;
		}
		
		if(m ==60) {
			m=0;
			h+=1;
			if(h>12) {
				h = h-12;
			}
		}
		
		int hAngle = (int) (((60 * h)+m) * 0.5);
		int mAngle = (m) * 6;
		
		int angleBetween = Math.abs(hAngle-mAngle);
		System.out.println("Angle between hours and minutes hand.");
		System.out.println(Math.min(360-angleBetween, angleBetween));
		
	}
	
	
	
}
