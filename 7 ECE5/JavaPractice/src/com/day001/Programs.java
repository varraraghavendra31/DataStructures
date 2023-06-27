package com.day001;
import java.util.Scanner;

//public class Programs {
//	public static void main(String []args) {
//		System.out.println("enter a number in binary:");
//		Scanner s=new Scanner(System.in);
//		int  decimal =s.nextInt();
//		int temp=1;
//		int binary=0;
//		while(decimal!=0) {
//			
//			int rem =decimal%2;
//			binary =binary+ temp *rem;
//			temp *=10;
//			decimal /=2;
//			s.close();
//			
//			
//		}
//		System.out.println("binary number is:"+binary);
//	}
//
//}


//class Programs {
//	public static void main(String []args) {
//		System.out.println("enter a number :");
//		Scanner s=new Scanner(System.in);
//		int  decimal =s.nextInt();
//		int n=decimal;
//		int reverse=0;
//		while(decimal!=0) {
//			
//			int rem =decimal%10;
//			reverse =reverse*10+rem;
//			decimal /=10;
//			s.close();
//			
//			
//		}
//		System.out.println("reversing of "+n+" number is:"+reverse);
//	}
//
//}

class BinaryToDecimal{

	static void m1(int m) {
		System.out.println("given binary value: "+m);
		int decimal=0;
		int temp=1;
		while(m!=0) {
			
			int rem=m%10;
			decimal=rem*temp+decimal;
			temp *=2;
			m/=10;
			
		}
		System.out.println("decimal number is: "+decimal);
	}
}

class Programs{
	public static void main(String[] args) {
		BinaryToDecimal.m1(1000);
		
		
	}
}
