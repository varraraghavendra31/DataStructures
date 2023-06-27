package com.numberPrograms;
import java.util.Scanner;
public class SwitchCase {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	boolean m;
	do {
	 m=true;
	System.out.println("enter a number\n 1 Alterneate prime\n 2 Automorphic num\n 3 happy num\n 4 neon num \n 5 perfectRange\n 6 second palindrome\n 7 exit");
	int n=sc.nextInt();
	switch(n) {
	case 1:{
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
//				System.out.println("h"+i);
				if(count%2!=0)System.out.println(i);
			}
		}
	}
		break;
	case 2:
	{
		System.out.println("enter a number:");
		int n1=sc.nextInt();
		int sq =n1*n1;
		System.out.println(sq);
		 boolean flag=false;
		while(n1>0) {
			int d=n1%10;
			int x=sq%10;
			if(x==d)flag=true;
			else flag=false;
			n1/=10;
			sq/=10;
			
		}
		if(flag) System.out.println("auto ");
		else System.out.println("not auto ");
	}
	break;
	case 3:
	{
		 int i = sc.nextInt();
		if(isHappy(i)) {
			System.out.println("Happy number ");
		}
		else System.out.println("Not a happy Number");
	}
	break;
	case 4:
	{
		int n1=sc.nextInt();
		int sum=0;
			int sq=n1*n1;
			while(sq>0) {
				sum+=sq%10;
				sq/=10;
			}
			if(sum==n1) System.out.println(n1+"Neon Number");
			else System.out.println("Not a Neon number");
	}
	break;
	case 5:
	{
		System.out.println("enter range");
		Scanner sc1=new Scanner(System.in);
		int s=sc1.nextInt();
		int l=sc1.nextInt();
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
	break;
	case 6:
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter smallest");
		int a=s.nextInt();
		System.out.println("enter highest");
		int b=s.nextInt();
		int count=0;
		for(int i=b;i>=a;i--) {
			int n1=i;
			int rev=0;
			while(n1!=0) {
				rev=rev*10+n1%10;
				n1/=10;
			}
			if(rev==i) count++;	
			if(count==2) {
				System.out.println(rev);
				break;
			}
		}
	}
		break;
		
	case 7:{
		m=false;
	}
		
	}
	}while(m);
}


public static boolean isHappy(int n) {
	int sum=0;
	while(n>=0) {
		while(n>9) {
			int r=n%10;
			sum+=r*r;
			n/=10;
			if(n==1) return true;
		}
		n=sum;
		if(n<9)return false;
		 
}
	return false;
}
}
