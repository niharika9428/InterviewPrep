package com.strings;

public class ReverseVowels {

   public static String reverseVowels(String s) {
        
        int i=0,j=s.length()-1;
        char temp;
        char[] str = s.toCharArray();
        while(i<j){
            if(isVowel(str[i]) && isVowel(str[j])){
                temp = str[i];
                str[i] = str[j];
                str[j] = temp;
                i++;
                j--;
            }else if(isVowel(str[i]) && !isVowel(str[j])) {
            	j--;
            }else if(!isVowel(str[i]) && isVowel(str[j])) {
            	i++;
            }else {
            	i++;
            	j--;
            }
        }
        return new String(str);
    }
    
    
   public static boolean isVowel(Character c){
       return c == 'a' | c == 'e'| c == 'i'| c=='o'| c=='u' |  c == 'A' | c == 'E'| c == 'I'| c=='O'| c=='U';
   }
    
    public static void main(String[] args) {
		System.out.println(reverseVowels("leetcode"));
	}
	
	
}
