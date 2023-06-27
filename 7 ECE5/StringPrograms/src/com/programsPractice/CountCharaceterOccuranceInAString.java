package com.programsPractice;
import java.util.Scanner;
public class CountCharaceterOccuranceInAString {
public static void main(String[] args) {
	System.out.println("enter comparing  String ");
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	String s1=s;
	String temp="";
	for(int i=0;i<s1.length();i++) {
		char ch=s1.charAt(i);
		if(temp.indexOf(ch)==-1) temp+=ch;
	}
	s1=temp;
	System.out.println(temp);
	char ch;
	for(int i=0;i<s1.length();i++) {
		int count=0;
		 ch=s1.charAt(i);
		for(int j=0;j<s.length();j++) {
			char c=s.charAt(j);
			if(ch==c) {
				count++;
			}
			
		}
		System.out.println(ch+" repeats = "+count);
	}
}
}


