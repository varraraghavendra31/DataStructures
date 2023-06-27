package com.numberPrograms;
import java.util.Scanner;
public class BasicPrograms {
public static void main(String[] args) {
//	SmallestAndGreatest();
	reverse();
}
public static void SmallestAndGreatest() {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a number");
	int n=sc.nextInt();
	int lar=0;
	int small=0;
	while(n!=0) {
		int d=(int)n%10;
		if(d>lar) {
			lar=d;
			small=lar;
		}
		if(small>d) {
			small=d;
		}
		n/=10;
	}
	System.out.println(small);
	System.out.println(lar);
}
public static void reverse(){
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a number");
	int n=sc.nextInt();
	int rev=0;
	while(n!=0) {
		int rem=n%10;
		 rev=rev*10+rem;
		 n/=10;
	}
	System.out.println(rev);
}
}
