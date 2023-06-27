package com.sortings;

import java.util.Arrays;

public class SelectionSort {
public static void main(String[] args) {
	int []a= {2,9,0,4,5,7,1,6};
	for(int i=0;i<a.length-1;i++) {
		int min=i;
		for(int j=i+1;j<a.length;j++) {
			if(a[min]>a[j]) min=j;
		}
		if(i!=min) {
			int temp=a[min];
			a[min]=a[i];
			a[i]=temp;
			
		}
	}
	System.out.println(Arrays.toString(a));
}
}
