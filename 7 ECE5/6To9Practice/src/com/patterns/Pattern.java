package com.patterns;
import java.util.Scanner;
public class Pattern {
public static void main(String[] args) {
	System.out.println("patterns");
	Pattern p=new Pattern();
	p.DTrainagle();
}
public void DTrainagle() {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a number");
	int n=sc.nextInt();
	for(int i=n;i>=0;i--) {
		for(int j=n;j>=n-i;j--) {
			System.out.print("*");
		}
		System.out.println();
	}
	
}
public void Diamond() {
	
}
public void hollowDiamond() {
	
}
public void hollowTriangle() {
	
}

}
