package sortings;

import java.util.Arrays;

public class SelectionSort {
public static void main(String[] args) {
	int []a= {2,5,9,3,1,0,7,8,2};
	for(int i=0;i<a.length-1;i++) {
		int minpos=i;
		for(int j=i+1;j<a.length;j++) {
			if(a[minpos]>a[j]) minpos=j;
		}
			if(i!=minpos) {
				int temp=a[minpos];
				a[minpos]=a[i];
				a[i]=temp;
			}
		}
	System.out.println(Arrays.toString(a));
	}
	
}

