package com.patterns;
public class Pattern8 {
public static void main(String[] args) {
	int n=8;
	int star=1;
	int space=n/2;
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=space;j++) {
			System.out.print(" ");
		}
		for(int j=1;j<=star;j++) {
			if(j==1||j==star) {
				System.out.print("*");
			}
			else System.out.print(" ");
		}
		System.out.println();
		if(i<n/2) {
			star+=2;
			space--;
		}
		if(i>n/2) {
			star-=2;
			space++;
		}
		
	}
	
}

}