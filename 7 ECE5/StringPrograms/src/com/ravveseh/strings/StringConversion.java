package com.ravveseh.strings;

import java.util.Scanner;

public class StringConversion {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a string ");
		String s=sc.next();
		String temp="";
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch>='A'&&ch<='Z') 
				temp +=(char) (ch+32);
			else if(ch>='a'&&ch<='z') 
				temp +=(char) (ch-32);
			else 
			 temp +=ch;
				
		}
		System.out.println(s+"\n after conversion \n"+temp);
		
	}
	

}