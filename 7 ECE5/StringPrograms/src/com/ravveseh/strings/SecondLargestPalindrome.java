package com.ravveseh.strings;

public class SecondLargestPalindrome {
public static void main(String[] args) {
	String s="malayalam";
	String s2="";
	int n=s.length();
	for(int i=0;i<n-1;i++) {
		for(int j=i+1;j<n;j++) {
			if(palin(s,i,j)) {
				System.out.println(s.substring(i,j+1));
				s2+=s.substring(i,j+1)+" ";
				}
	}		
 }
//	System.out.println(s2);
	String b=sec(s2);
	System.out.println("second largest palindrome \n"+b);
	
}
public static String sec(String s) {
	int sec=0;
	String[] a=s.split(" ");
	int lar=0;
	for(String b:a) {
		if(lar<b.length())
		{
			
			lar=b.length();
			System.out.println(lar);
		}
		else if(sec<b.length())
			 sec=b.length();
		else continue;
	}
	System.out.println(sec);
	
	for(int i=0;i<a.length;i++) {
		if(sec==a[i].length())return a[i];
	}
	return "";
	}
public static boolean palin(String a,int start,int end) {
	
	for(int i=start,j=end;i<j;i++,j--) {
		if(a.charAt(i)!=a.charAt(j)) return false;
	}
	return true;
	
	
}
}
