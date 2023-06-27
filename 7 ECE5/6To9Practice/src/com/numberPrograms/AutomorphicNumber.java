package com.numberPrograms;
import java.util.Scanner;
public class AutomorphicNumber {
	public static void main(String[] args) {
		System.out.println("enter a number:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sq =n*n;
		System.out.println(sq);
		 boolean flag=false;
		while(n>0) {
			int d=n%10;
			int r=sq%10;
			if(r==d)flag=true;
			else flag=false;
			n/=10;
			sq/=10;
			
		}
		if(flag) System.out.println("auto ");
		else System.out.println("not auto ");
	}
	
}
