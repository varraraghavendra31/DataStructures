package com.programsPractice;

import java.util.Scanner;

public class CountAlphaNumSpecial {
	public static void main(String[] args) {
	Scanner scan= new Scanner(System.in);
	System.out.println("enter a String ");
	String s=scan.next();
	int alphabet = 0,number=0,special=0;
	for(int j=0;j<s.length();j++) {
		char ch=s.charAt(j);
		if((ch>='A'&&ch<='Z')||(ch>='a'&&ch<='z'))
		alphabet++;
		else if(ch>='0'&&ch<='9')
			number++;
		else special++;
	}
	System.out.println("alphabets = "+alphabet+" numbers = "+number+" special = "+special);
}

}
