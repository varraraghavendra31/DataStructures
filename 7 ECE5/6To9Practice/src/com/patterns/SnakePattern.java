package com.patterns;

public class SnakePattern {
public static void main(String[] args) {
	int n=5;
	for(int i=1;i<=n;i++) {
		if(i%2!=0) {
			int num=(i-1)*n+1;
			for(int j=1;j<=n;j++) {
				System.out.print(num+ "\t");
				num++;
			}
		}
		else  {
			int num=n*i;
			for(int j=1;j<=n;j++) {
				System.out.print(num+ "\t");
				num--;
				
		}
				
	}
		System.out.println();
		
}
	
}
}