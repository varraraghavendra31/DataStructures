package StringPrograms;
import java.util.Scanner;
public class SecondSmallNumInArray {
public static void main(String[] args) {
	
	int[]a= {0,8,12,5};
	int first=a[0];
	int second=a[0];
	for(int i=1;i<a.length;i++) {
		if(a[i]<first) {
			second=first;
			first=a[i];	
		}
		else if(a[i]<second||first==second) {
				second=a[i];
			}
		else if(a[i]==first) {
			continue;
		}
	}
	System.out.println(second);
}
}