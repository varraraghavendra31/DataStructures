package com.programsPractice;
import java.util.Scanner;
public class AnagramString {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a string ");
	String s=sc.next();
	s=s.toLowerCase();
	String str=sc.next();
	str=str.toLowerCase();
//	char[]a=s.toCharArray();
//	char[]b=str.toCharArray();
//	boolean flag=false;
//	for(char c:a) {
//		for(char z:b) {
//			if(c==z)
//				{
//				flag=true;
//				break;
//				}
//		}
//	}
//	System.out.println(str);//amma
//	System.out.println(s);//ammo
//	System.out.println(str.length()+" "+s.length());
	boolean flag;
//		while(s.length()==str.length()) {
	if(s.length()==str.length()) {
		flag=false;
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			System.out.println(ch);
			for(int j=0;j<str.length();j++) {
				char c=str.charAt(j);
				System.out.println(c+"h");
				if(ch==c) {
				flag=true;
				break;
				}
				else  
					flag=false;
				
		}
			if(flag==false)break;
		
	}
		if(flag) System.out.println("its a anagram");
		else System.out.println("its not  anagram");
	}
		
		else {
		System.out.println("its  not anagram");
		}	
}
}
//}
