package com.numberPrograms;
import java.util.Scanner;
public class Secondpalindrome {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter smallest");
		int a=s.nextInt();
		System.out.println("enter highest");
		int b=s.nextInt();
		int count=0;
		for(int i=b;i>=a;i--) {
			int n=i;
			int rev=0;
			while(n!=0) {
				rev=rev*10+n%10;
				n/=10;
			}
			if(rev==i) count++;	
			if(count==2) {
				System.out.println(rev);
				break;
			}
			
		}
		

	}

}
