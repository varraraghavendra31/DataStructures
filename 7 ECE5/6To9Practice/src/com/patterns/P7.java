package com.patterns;

import java.util.Scanner;

public class P7 {
	public static void main(String[] args) {
		System.out.println("enter row num");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int x=n;
		for(int i=1;i<=n;i++) {
			for(int k=1;k<i;k++) {
				System.out.print(" ");
			}
			for(int j=1;j<=x;j++) {
				 
				if(i==1||j==1||j==x)System.out.print("*");
				else System.out.print(" ");
			}
			x-=2;
			System.out.println();
		}
	}
}
