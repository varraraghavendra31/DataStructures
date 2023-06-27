package com.ravveseh.strings;
import java.util.Scanner;
public class StringPalindrome {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string ");
		String s=sc.next();
//		boolean b=isPalindrome("MADAM");
		
		if(isPalindrome(s)) System.out.println("it is a palindrome");
		else System.out.println("it is not a palindrome");
		
		}
	public static boolean isPalindrome(String s) {
		char[] ch=s.toCharArray();
		for(int i=0,j=ch.length-1;i<j;i++,j--) {
			if(ch[i]==ch[j]) {
				return true;
			}
	}
		return false;
	}
}
	


