package TwoDarraysProblems;

public class fibonacciSeries {
public static void main(String[] args) {
	int[][]s=new int [10][];
	int a=0;
	int b=1;
	int c;
	for(int i=1;i<s.length;i++) {
		s[i]=new int[5];
		 
		for(int j=1;j<=s[i].length;j++) {
			
		if(i<=s.length/2) {
			if(i==j) {
				System.out.print(a);
			}
			else System.out.print("*");
		}
		}
		c=a+b;
		a=b;
		b=c;
		System.out.println();
		}
	}
  }
