package com.programsPractice;
import java.util.Scanner;

public class MissingAlphabetString {
public static void main(String[] args) {
	System.out.println("take a string in capital letters");
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	String s1="abcdefghijklmnopqrstuvwxyz";
	String temp="";
	for(int i=0;i<s1.length();i++) {
		char ch=s1.charAt(i);
		if(s.indexOf(ch)==-1) temp+=ch;
	}
//	for(int i=0;i<s1.length();i++) {
//		char ch=s1.charAt(i);
//		if(temp.indexOf(ch)==-1) temp+=ch;
//	}
	
	System.out.println(temp);
	
}
}
