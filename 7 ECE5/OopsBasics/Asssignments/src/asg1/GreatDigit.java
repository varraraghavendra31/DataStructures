package asg1;
import java.util.Scanner;


public class GreatDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("enter  a num:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int great=0;
		
		while(n>=0) {
			int d= n%10;
			great = d<great? great:d;
			n /=10;
			
		}
		System.out.println(great);
		

	}

}

