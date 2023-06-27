package com.jsp.Basics;

public class Perfect {
public static void main(String[] args) {
	int a=6;
	int b=100;
	for(;a<=b;a++) {
		int sum=0;
		for(int j=1;j<=a/2;j++) {
			if(a%j==0) sum+=j;
		}
		if (sum==a) System.out.println(sum);
	}
}
}

	
	


