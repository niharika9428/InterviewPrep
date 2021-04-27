package com.strings;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		
		//String arr[]= {"geeksforgeeks", "geeks", "geek","geezer"};
		//String arr[]= {"hello","world"};
		String arr[]= {"dmlrpjyatcoqotxzplqmlptaipczhlikztcofaoaedruyqundkzqatqkkvjrgucineyugnxmsohsgdfmngcpbvamqldyfhgvnfrv",
				"oioerglunzjvbzxwblooqnuytrnyijuxtibkoogdppzrqyptjeizrezmvnnfyherqidgyjkoyjfrhwkscsrvytivivbgcfxupab",
				"llclwjcdfpvijodijndriexnmwhbyiplvtxrcbwkqtsaixitn",
				"lvskkgjujheztaustxtqhklbkvyupnhajbmvhvprfusawmspjlhsvtthouddhlfsmsqwpfpubhuzvmrhaazx"};

		
		String prefix = longestCommonPrefix(arr,arr.length);
		System.out.println(prefix);
		
	}
	
    public static String longestCommonPrefix(String arr[], int n){
        
        String longestCommonPrefix = "-1";
        if( arr.length == 0 || arr == null) return longestCommonPrefix;
        int index= 0;
        for (char c : arr[0].toCharArray()) {
			for(int i=1;i<arr.length;i++) {
				if(index >= arr[i].length() || c != arr[i].charAt(index)) {
					return longestCommonPrefix;
				}
				longestCommonPrefix+=c;
				index++;
			}
		} 
        return longestCommonPrefix;
    }
}
