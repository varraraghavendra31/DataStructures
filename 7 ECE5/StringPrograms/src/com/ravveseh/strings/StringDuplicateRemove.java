package com.ravveseh.strings;
import java.util.Scanner;
public class StringDuplicateRemove {
public static void main (String[]args) {
	System.out.println("enter a string ");
	Scanner sc=new Scanner(System.in);
//	String s=sc.next();//banaann
	String s="banana";
	String temp="";
	/*indexof(char ch) return integer 
	 * if character not present in string it return -1
	 * and palindrome
	 * MADAM chech upto madam
	 * */
	for(int i=0;i<s.length();i++) {
		char ch=s.charAt(i);
		if(temp.indexOf(ch)==-1) {
			temp +=ch;
		}
	}
	System.out.println("**********************************");
	System.out.println(" after delete duplicate's remaining string is \n "+temp);
	
}
}
