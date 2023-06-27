package com.ravveseh.strings;
import java.util.Scanner;
public class ReplaceCharacterWithoutBuiltInReplace {
public static void main(String[] args) {
	System.out.println("enter a string");
	Scanner sc=new Scanner(System.in);
	String s=sc.next();//raveeshaa
	String s1="";
	for(int i=0;i<s.length();i++) {
		if(s.charAt(i)=='a') s1+='b';
		else s1+=s.charAt(i);
		
	}
	System.out.println(s1);//rbveeshaa
}
}
