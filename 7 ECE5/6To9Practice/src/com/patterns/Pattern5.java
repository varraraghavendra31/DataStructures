package com.patterns;

public class Pattern5 {
public static void main(String[] args) {
	int n=5;
//	m1(n);
//	m2(n);
//	m3(n);
	m4(n);
	
}
private static void m1(int n) {
	for(int i=1;i<=n;i++) {
		for(int j=1;j<i;j++) {
			System.out.print(" ");
		}
		for(int j=n;j>=i;j--) {
			System.out.print("*");
		}
		System.out.println();
	}
}
private static void m2(int n) {
	int x=n;
	for(int i=1;i<=n;i++) {
		for(int j=1;j<i;j++) {
			System.out.print(" ");
		}
		for(int j=n;j>=i;j--) {
			System.out.print(x--);
		}
		x=n;
		System.out.println();
	}
}
private static  void m3(int n) {
	for(int i=1;i<=n;i++) {
		for(int j=1;j<i;j++) {
			System.out.print(" ");
		}
		for(int j=i;j<=n;j++) {
			System.out.print(j);
		}
		System.out.println();
	}
}
private static void m4(int n) {
	for(int i=n;i>=1;i--) {
		for(int j=i;j>1;j--) {
			System.out.print(" ");
		}
		for(int j=n;j>=i;j--) {
			System.out.print(j);
		}
		System.out.println();
	}
}
}
