package com.ravveseh.strings;

import java.util.Scanner;

public class FirstAndLastLetterCapital {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s="java is  easy";
		System.out.println(s.length());
		s=s.trim();
		String s1="";
		for(int i=0;i<s.length();i++) {
			if(i==s.length()-1||i==0||s.charAt(i+1)==' ') s1+=(char)(s.charAt(i)-32)+"";
			
			else if(s.charAt(i)==' ')
					{  s1=s1.trim();
						s1+=" "+(char)(s.charAt(i+1)-32);
						i++;
					}
				
			else
				s1+=s.charAt(i)+"";
		}
		System.out.println(s1);
		System.out.println(s.length());
	}

}
