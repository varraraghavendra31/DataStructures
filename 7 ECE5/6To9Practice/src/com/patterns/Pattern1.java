package com.patterns;
import java.util.Scanner;
public class Pattern1 {
public static void main(String[] args) {
	System.out.println("enter a num");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=n;j++) {
			if(i==1||i==n||i==j||i+j==n+1||j==1||j==n) System.out.print("* ");
			else
				System.out.print("  ");
		
	}
		System.out.println();
	}
}
}