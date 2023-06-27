package Programs;
import java.util.Scanner;
public class PascalTriangle {
	public static void main(String[] args) {
		System.out.println("enter a number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<=n;i++) {
			for(int j=n;j>=i;j--) {
				System.out.print(" ");
			}
			//this is important condition mind it 
			int c=1;
			for(int j=1;j<=i+1;j++) {
				System.out.print(c+" ");
//				c *=(i-j+1)/j;
				c =c*(i+1-j)/j;
			}
			System.out.println();
		}
	}

}
