package in.raghava.patterns;
import java.util.Scanner;

public class DiamondPattern {
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		        System.out.println("Enter the row size:");

		       int n=sc.nextInt();
		       for(int i =n;i>=-n;i--)
		       {
		           for(int j=1;j<=Math.abs(i );j++)
		           {
		               System.out.print("h");
		           }
		           for(int k=n;k>=Math.abs(i);k--)
		           System.out.print("* ");
		           System.out.println();
		       }
		       sc.close();
		 
		}

	}

