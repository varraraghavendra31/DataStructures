package Programs;
import java.util.Scanner;
public class MagicNumber {
	public static void main(String[] args) {
		System.out.println("enter a number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=n;
		int sum;
		do {
			sum =0;
			while(n!=0) {
			sum += n % 10;
			n /= 10;
			}
				n=sum;
			}
			while(n>9);	
		if (sum == 1)
			System.out.println(" A magic  Number "+m);
		else
			System.out.println("not a Number"+m);
		
//		do {
//			sum=0;
//			while (n > 0) {
//				sum += n % 10 * n % 10;
//				n /= 10;
//			}
//			n = sum;
//		} while (n > 9);
//		if (sum == 1)
//			System.out.println("Its A Happy Number");
//		else
//			System.out.println("Its A Unhappy Number");
//	}
		
	}

}

