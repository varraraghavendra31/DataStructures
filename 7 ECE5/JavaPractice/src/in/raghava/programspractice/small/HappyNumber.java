package in.raghava.programspractice.small;
import java.util.Scanner;
public class HappyNumber {
	public static void main(String[] args) {
		System.out.println("enter a num");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=n;
		int sum=0,d;
		while(sum!=1&&sum!=4)
		{
		sum=0;
		while(n!=0) {
			 d=n%10;
			sum+=(d*d);
			n/=10;
			
		}
		n=sum;
	}
		if(sum==1)
		System.out.println(" a happy number");
		else System.out.println("not a happy number");
		sc.close();
	}	
	}


