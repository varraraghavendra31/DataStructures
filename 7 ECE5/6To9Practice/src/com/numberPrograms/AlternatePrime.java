package com.numberPrograms;
import java.util.Scanner;
public class AlternatePrime {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter range");
	int a=sc.nextInt();
	int b=sc.nextInt();
	int count=0;
	for(int i=a;i<=b;i++){
		boolean flag=true;
		for(int j=2;j<=i/2;j++) {
			if(i%j==0) {
				flag=false;
				break;
			}
		}
		
		if(flag) {
			count++;
//			System.out.println("h"+i);
			if(count%2!=0)System.out.println(i);
		}
	}
}
}
