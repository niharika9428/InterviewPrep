package com.strings;

public class Urlify {

	
	public static void main(String[] args) {
		String str = "My Name is Niharika";
		int spaceCount=0;
		char intput[] = str.toCharArray();
		for (char c : intput) {
			if(c == ' ') spaceCount++;
		}
		int index = str.length()+spaceCount*2;
		char arr[] = new char[index];
		for (int i = intput.length-1; i>=0; i--) {
			if(intput[i]==' ') {
				arr[index-1]='0';
				arr[index-2]='2';
				arr[index-3]='%';
				index = index-3;
			}else {
				arr[index-1] = intput[i];
				index =index-1;
			}
		}
		String s = new String(arr);
		System.out.println(s);
	}
}
