package asg1;
import java.util.Scanner;
public class ButterflyPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("enter number of rows ");
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) System.out.print("*");
			for(int j=1;j<=2*(n-i);j++) System.out.print(" ");
			for(int j=1;j<=i;j++) System.out.print("*");
			System.out.println();							
		}
		for(int i=0;i<=n;i++) {
			for(int j=n-i;j>=1;j--) System.out.print("*");
			
			for(int j=1;j<=2*i;j++) System.out.print(" ");
			for(int j=1;j<=n-i;j++) System.out.print("*");
			
			System.out.println();	
		}
		
		
	}

}
