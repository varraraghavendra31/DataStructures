package com.patterns;
import java.util.Scanner;
public class Sidetriangle {
public static void main(String[] args) {
	System.out.println("enter a num");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	for(int i=1;i<=n-1;i++) {
		for(int j=1;j<=n;j++) {
			if(i<=n/2&&i==j) {
				System.out.print("*");
			}
			if(i>n/2&&i+j==n) System.out.print("*");
			else System.out.print(" ");
		}
		System.out.println();
		
	}
}
}
