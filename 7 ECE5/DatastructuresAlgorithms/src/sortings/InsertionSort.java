package sortings;

import java.util.Arrays;

public class InsertionSort {
public static void main(String[] args) {
	int[]arr= {2,9,6,5,8,2};
	sort(arr);
	System.out.println("sorted array : "+Arrays.toString(arr));
}

public static void sort(int[] arr) {
	for(int i=1;i<arr.length;i++) {
		//store in a variable
		int key=arr[i];
		//to get previous index
		int j=i-1;
		//check current value with previous value
		while(j>=0&&arr[j]>key) {
			arr[j+1]=arr[j];
			j--;
		}
		arr[j+1]=key;
	}
	
}
}
