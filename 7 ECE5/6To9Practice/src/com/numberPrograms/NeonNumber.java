package com.numberPrograms;
import java.util.Scanner;
public class NeonNumber {
public static void main(String[] args) {
	System.out.println("enter a number");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int sum=0;
		int sq=n*n;
		while(sq>0) {
			sum+=sq%10;
			sq/=10;
		}
		if(sum==n) System.out.println(n+"Neon Number");
		else System.out.println("Not a Neon number");
}
}
