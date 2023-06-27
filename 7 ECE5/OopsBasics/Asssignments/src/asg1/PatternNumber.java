package asg1;
import java.util.Scanner;
public class PatternNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter a number:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=n;i>0;i--) {
			for(int j=i;j>=1;j--) {
				System.out.print(j+" ");
				
			}
			System.out.println();
		}
		
		
		

	}

}
