package com.programsPractice;
import java.util.Scanner;
public class AlphabetNumberFormatInAString {
	public static void main(String[] args) {
		System.out.println("Enter a string in mix of alphabet number and specila characters");
		Scanner sc=new Scanner(System.in);
//		String s=sc.nextLine();
		String s="abc123def@#456frdg";
		String alpha="";
		String num="";
		String special="";
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if((ch>='A'&&ch<='Z')||(ch>='a'&&ch<='z'))
				alpha+=ch;
				else if(ch>='0'&&ch<='9')
					num+=ch;
				else special+=ch;
			}
		System.out.println(alpha+num+special);
		
		}
	}


