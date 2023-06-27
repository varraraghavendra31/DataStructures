package com.numberPrograms;
import java.util.Scanner;
public class HappyNumber {
public static void main(String[]args) {
	System.out.println("enter a number:");
	Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
//	for(int a=1;a<=100;a++) {
		if(isHappy(n)) {
			System.out.println("Happy number "+n);
		}
		else System.out.println("Not a happy Number");
//	}
	
}
public static boolean isHappy(int n) {
		
		while(true) {
			int sum=0;
			while(n>0) {
				int r=n%10;
				sum+=r*r;
				n/=10;
				
			}
			if(sum==1) return true;
			n=sum;
			if(sum<9)return false;
			 
	}
	
}
}
