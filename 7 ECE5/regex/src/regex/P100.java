package regex;
import java.util.Arrays;
public class P100 {
public static void main(String[] args) {
	System.out.println("enter an array");
	int []a= {9,5,7,2,4,0,1};
//	System.out.println(Arrays.toString(a));
	for(int i=0;i<a.length-1;i++) {
		int index=i;
		for(int j=i+1;j<a.length;j++) {
			if(a[index]>a[j])index=j;
		}
			while(index!=i) {
				int temp=a[index];
				a[index]=a[i];
				a[i]=temp;
			}
			
		}
	System.out.println(Arrays.toString(a));
	}
}

