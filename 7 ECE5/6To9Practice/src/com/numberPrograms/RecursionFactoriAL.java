package com.numberPrograms;
import java.util.Scanner;
public class RecursionFactoriAL {
public static void main(String[] args) {
	System.out.println("enter a number ");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
//	System.out.println(fact(n));
	System.out.println(sum(n));
	
}

public  static int fact(int i) {
	if(i==0) {
		return 1;
	}
	System.out.print(i+" ");
	return i*fact(--i);
	
}
public static  int sum(int n) {
	if(n==1)return n;
	return n+sum(n-1);
}
}