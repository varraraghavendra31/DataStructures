package Algorithms;

import java.util.Arrays;

public class SelectionSort {
public static void main(String[] args) {
	int[]a= {4,5,2,3,8,9,0,1,7};
	for(int i=0;i<a.length-1;i++) {
		int min=i;
		for(int j=i+1;j<a.length;j++) {
			if(a[min]>a[j]) {
				min=j;
			}
		}
		int temp=a[i];
		a[i]=a[min];
		a[min]=temp;
	}
	System.out.println(Arrays.toString(a));
}
}
