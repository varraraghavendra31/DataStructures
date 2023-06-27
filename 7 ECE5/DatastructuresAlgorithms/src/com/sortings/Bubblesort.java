package com.sortings;

import java.util.Arrays;

public class Bubblesort {
public static void main(String[] args) {
	int  a[]= {2,9,0,6,8,3,5,4,0,1,2,9,56,23};
	for(int i=0;i<a.length-1;i++) {
		for(int j=0;j<a.length-1-i;j++) {
			if(a[j]>a[j+1]) {
				//here you are doing swaping
				int temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			}
		}
	}
	System.out.println(Arrays.toString(a));
}
}
