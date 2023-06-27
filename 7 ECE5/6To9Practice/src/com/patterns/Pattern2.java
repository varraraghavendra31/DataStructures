package com.patterns;
import java.util.Scanner;
public class Pattern2 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a  num ");
	int n=sc.nextInt();
	int x=n;
	for(int i=1;i<=n;i++) {
		
	for(int j=1;j<=i;j++) {
		if(x==0)break;
		System.out.print(x--+"\t");
	}
	System.out.println();
	}
}
}
