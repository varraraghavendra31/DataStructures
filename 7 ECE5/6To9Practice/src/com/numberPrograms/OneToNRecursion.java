package com.numberPrograms;
import java.util.Scanner;
public class OneToNRecursion {
public static void main(String[] args) {
	System.out.println("enter a number");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	decr(n);
}
public static void decr(int n) {
	if(n==1) {
		System.out.print(1+" ");
		return;
	}
	System.out.print(n+" ");
//	decr(--n);
	decr(n-1);
}
}
