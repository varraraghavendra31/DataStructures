package com.numberPrograms;
import java.util.Scanner;
public class PhoneNumPrime {
public static void main(String[] args) {
	System.out.println("enter a num");
	Scanner sc=new Scanner(System.in);
	String s=sc.next();
	char[]b=s.toCharArray();
	String s1="";
	int n =count(b);
	System.out.println(count(b));
	if(n%2==0) {
		for(int i=0;i<b.length;i++) {
			int d=b[i]-'0';
			if(prime(d)){
				while(true) {
					if(prime(++d)) {
						s1+=" "+d;
						break;
					}
						
				}
				 
			}
			else s1+=" "+d;
		}
	}
	else {
		for(int i=0;i<b.length;i++) {
			int d=b[i]-'0';
			if(prime(d)){
				while(true) {
				if(!prime(--d)) {
					s1+=""+d;
					break;
				}
					
			}
			}
			else s1+=""+d;
		}
	}
	System.out.println(s1);
}
//	System.out.println(prime(4));

public static boolean prime(int num) {
	if(num<=1)return false;
	for(int i=2;i<=num/2;i++) if(num%i==0)return false;
	return true;
}
public static int count(char[]b) {
	int count=0;
	for(int i=0;i<b.length;i++) {
		int d= b[i]-'0';
		if(prime(d)) ++count;	
}
	return count;
}
}
