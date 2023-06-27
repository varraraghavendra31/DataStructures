package com.numberPrograms;

public class ShivaProgram {
public static void main(String[] args) {
	int n=0;
	for(int i=9;i>=0;i--) {
		
		for(int j=n;j<=9;j++){
			System.out.println(j+"+"+i);
			break;
		}
		n++;
	}
}
}
