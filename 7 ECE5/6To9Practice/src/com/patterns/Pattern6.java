package com.patterns;
import java.util.Scanner;
public class Pattern6 {
public static void main(String[] args) {
	System.out.println("enter row num");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	for(int i=1;i<=n;i++) {
		if(i<=(n/2)+1) for(int j=1;j<=i;j++) System.out.print("*");
		else 
			for(int j=1;j<=n-i+1;j++)  System.out.print("*");
		
		System.out.println();
}
}
}
