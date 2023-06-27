package sortings;

import java.util.Arrays;

public class BubbleSort {
	static int count;
public static void main(String[] args) {
	int[]a= {2,5,6,8,9,4,3,0,9,10,1};
	System.out.println(Arrays.toString(a));
	sort(a);
	System.out.println(Arrays.toString(a));
//	System.out.println(count);
		
	}
// both methods same steps
private static void sort(int[] a) {
//	for(int i=0;i<a.length;i++) {
////		System.out.println(a[i]);
//		for(int j=1;j<a.length-i;j++) {
//			if(a[j]<a[j-1]) {
//				int temp=a[j-1];
//				a[j-1]=a[j];
//				a[j]=temp;
//				
//			}
//		}
//}
for(int i=0;i<a.length-1;i++) {
	System.out.println(i);
	for(int j=0;j<a.length-1-i;j++) {
		count++;
		if(a[j]>a[j+1]) {
			int temp=a[j];
			a[j]=a[j+1];
			a[j+1]=temp;
			
		}
		
	}
}
}
}

