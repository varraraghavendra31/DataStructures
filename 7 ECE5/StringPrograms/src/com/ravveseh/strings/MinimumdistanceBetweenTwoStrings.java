package com.ravveseh.strings;
import java.util.Scanner;
public class MinimumdistanceBetweenTwoStrings {
public static void main(String[] args) {
	String[]s= {"the","geeks","book","fox","geeks","hello","practice"} ;
	int a=count(s);
	System.out.println(a);
}
public static int count(String[] s) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter first string ");
	String n=sc.next();
	System.out.println("enter second string");
	String s1=sc.next();
	int temp=0;
	for(int i=0;i<s.length;i++) {
		int count=0;
		if(s[i].equals(n)) {
			for(int j=i+1;j<s.length;j++) {
				count++;
				if(s1.equals(s[j])) {
					if(count>temp) {
						temp=count;
					}
					else temp=count;
				}
			}
		}
	}
	return temp;
}
}
