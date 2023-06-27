package com.ravveseh.strings;

public class LargestPalindrome {

	public static void main(String[] args) {
		String s="malayalamabcdfgh";
		String c="";
		int b=0;
		for(int i=0;i<s.length()-1;i++) {
			for(int j=i+1;j<s.length();j++){
				if(isPalindrome(s,i,j)) {
					System.out.println(s.substring(i,j+1));
					if(b<s.substring(i,j+1).length())
						{
						b=s.substring(i,j+1).length();
						c=s.substring(i,j+1);
						
						}
				}
			}
		}
		System.out.println(c+" bha");

	}

	private static boolean isPalindrome(String s, int start, int end) {
		for(int i=start,j=end;i<j;i++,j--) {
			if(s.charAt(i)!=s.charAt(j))return false; 
		}
		return true;
		
	}

}
