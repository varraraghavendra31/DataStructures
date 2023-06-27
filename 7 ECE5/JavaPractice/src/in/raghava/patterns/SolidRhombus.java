package in.raghava.patterns;

import java.util.Scanner;

public class SolidRhombus {
	public static void main(String[] args) {
			System.out.println("Enter a number: ");
			Scanner in=new Scanner(System.in);
			int n=in.nextInt();
			in.close();
			for(int i=1;i<=n;i++)
			{
				for(int j=1;j<=n-i;j++) {
					System.out.print(" ");
				}
				for(int j=1;j<=n;j++) 
					{
					System.out.print("*");
					}
				System.out.println();
				}

			
			
		}
	}
	//
	//for(int j=i;j<=n;j++) {
//		System.out.print(" ");
	//}
	//for(int k=n;k>=1;k--) 
//		{
//		System.out.print("*");
//		}
	//System.out.println();
	//}




