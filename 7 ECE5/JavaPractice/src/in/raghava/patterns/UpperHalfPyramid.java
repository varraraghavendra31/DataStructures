package in.raghava.patterns;

import java.util.Scanner;

public class UpperHalfPyramid {

		 public static void main(String[] args) {
		        Scanner cs = new Scanner(System.in);

		        System.out.println("Enter the row size:");
		        int  row_size= cs.nextInt();

		        for (int out = 1; out <=row_size; out++) {
		            for (int in =  1; in <row_size-out+1;in++)
		                System.out.printf(" ");
//		            for (int in =2*out-1; in>=1; in--)
		            for (int in =1; in<=2*out-1; in++)
		            
		                System.out.print("*");
		            System.out.println();
		        }
		        cs.close();
		    }
	/* 
	   *
	  ***
	 *****
	*******
	*
	 */

	}


