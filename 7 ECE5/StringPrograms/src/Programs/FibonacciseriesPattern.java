package Programs;
import java.util.Scanner;
public class FibonacciseriesPattern {
	static int  c=0;
	public static void main(String[] args) {
		System.out.println("enter a number");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a=0,b=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=(n+1)/2;j++) {
				if(i==1) {
				for(int h=1;h<=(n+1)/2;h++) {
				System.out.print(c+" ");
				a=b;
				b=c;
				c=a+b;	
				}
				System.out.println();
				}
				else if(i==n/2) {
					for(int k=1;k<=(n+1)/2;k++) {
						System.out.print(c+" ");
						a=b;
						b=c;
						c=a+b;	
						}
					System.out.println();
				}
				else if(i==n) {
					for(int m=1;m<=(n+1)/2;m++) {
						System.out.print(c+" ");
						a=b;
						b=c;
						c=a+b;	
						}
					System.out.println();
			}
		}
	}
	}
}

