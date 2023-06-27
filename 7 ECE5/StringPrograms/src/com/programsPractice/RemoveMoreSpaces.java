package com.programsPractice;

public class RemoveMoreSpaces {
public static void main(String[] args) {
	String s="  java      is        easy    ";
	String s2="";
	s=s.trim();
	System.out.println(s);
	int count=0;
	for(int i=0;i<s.length();i++) {
		if(s.charAt(i)==' ') {
			if(count<1)s2+=s.charAt(i);
			count++;
		}
		else {
			s2+=s.charAt(i);
			count=0;
		}
		
	}
	System.out.println(s2);
}
}
