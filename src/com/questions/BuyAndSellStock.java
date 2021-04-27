package com.questions;

public class BuyAndSellStock {

	//O(n)
	public static void main(String[] args) {
		int stocks[] = {1,7,9,8,13,1,3};
		int min = Integer.MAX_VALUE;
		int max=0;
		int buy=-1,sell=-1;
		for (int i = 0; i < stocks.length; i++) {
			if(stocks[i] < min) {
				min = stocks[i];
				buy = i;
			}else if((stocks[i] - min ) > max){
				max = stocks[i] - min ;
				sell = i;
			}
		}
		System.out.println("Buy on day : "+(buy+1));
		System.out.println("Sell on day : "+(sell+1));
		System.out.println("Max profit : "+max);
	}
}
