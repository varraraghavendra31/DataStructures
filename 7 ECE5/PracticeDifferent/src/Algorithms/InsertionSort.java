package Algorithms;

import java.util.Arrays;

public class InsertionSort {
public static void main(String[] args) {
	int[]a= {1,2,0,6,4,7,3,9};
	for(int i=0;i<a.length-1;i++) {
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

