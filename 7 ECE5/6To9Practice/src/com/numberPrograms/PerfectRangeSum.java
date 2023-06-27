package com.numberPrograms;
import java.util.Scanner;
public class PerfectRangeSum {
public static void main(String[] args) {
	System.out.println("enter range");
	Scanner sc=new Scanner(System.in);
	int s=sc.nextInt();
	int l=sc.nextInt();
	int total=0;
	for(int i=s;i<=l;i++) {
		int sum=0;
		for(int j=1;j<=i/2;j++) {
			if(i%j==0)sum+=j;
		}
		if(sum==i)total+=sum;
	}
	System.out.println(total);
}
}
