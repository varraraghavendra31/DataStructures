package com.programsPractice;

import java.util.Scanner;
public class CountNumCharacter {
	public static void main(String[] args) {
		System.out.println("enter a character in CAPITAL LETTER");
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		char ch=sc.next().charAt(0);
		int count=0;
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(ch==c) count++;
		}
		System.out.println("count occurances of a character "+count);
		
	}
}
