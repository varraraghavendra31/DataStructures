package patternNumeric;

import java.util.Scanner;

public class Pattern2 {
	public static void main(String[] args) {
		m1(3);
	}

	public static void m1(int k) {
		
		int count=1;
		for(int m=1;m<=k;m++) {
			for (int i = 1; i <= 5; i++) {
				for(int j=1;j<=3;j++) {
					if(i==j||i+j==6)System.out.print(count++);
					else System.out.print("*");
				}
				System.out.println();
			}
		}
		
	}
}
