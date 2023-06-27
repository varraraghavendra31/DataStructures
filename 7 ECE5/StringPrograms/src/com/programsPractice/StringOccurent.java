package com.programsPractice;

public class StringOccurent {
public static void main(String[] args) {
	String s="aabbcc";
	char[]a=s.toCharArray();
	String s1="";
	int k=0;
	for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
			for(int j=0;j<a.length;j++) {
				if((int)a[i]>='a'||(int)a[i]<='z') {
					if(j==a.length-1)break;
					k++;
					s1+=a[i];
				}
				
			}
			s1+=a[i];
			k=0;
		}
	System.out.println(s1);
}
}
