package com.programsPractice;
import java.util.Scanner;
public class Panagram {
public static void main(String[] args) {
	System.out.println("enter a string to check panagram");
/*
 * if it contains all alphabets its called panagram other wise its not a panagram
 */
	Scanner sc=new Scanner(System.in);
	String str=sc.nextLine();
	str=str.toLowerCase();
	char[]s=str.toCharArray();
	boolean flag = true;
	String s1="abcdefghijklmnopqrstuvwxyz";
	char[]str1=s1.toCharArray();
	for(char c:s) {
		flag=false;
		for(char z:str1) {
			if(c==z) flag=true;
		}
		if(flag==false)
			break;
	}
	if(flag) System.out.println("its  a panagram");
	else System.out.println("it is not a panagram");
}
}
