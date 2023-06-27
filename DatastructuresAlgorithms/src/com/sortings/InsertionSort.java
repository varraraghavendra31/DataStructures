package com.sortings;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		int []a= {2,1,6,8,0,9,5,1,7,5,4,};
		for(int i=1;i<a.length;i++) {
			int curr=a[i];
			int prev=i-1;
			while(prev>=0&&a[prev]>curr) {
				a[prev+1]=a[prev];
				prev--;
			}
			a[prev+1]=curr;
		}
		System.out.println(Arrays.toString(a));
	}

}
