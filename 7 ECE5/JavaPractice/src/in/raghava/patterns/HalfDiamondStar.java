package in.raghava.patterns;
import java.util.*;
public class HalfDiamondStar {

	 public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	        System.out.println("Enter the row size:");

	       int n=sc.nextInt();
	       for(int i=n ;i>=-(n-1);i--)
	       {
	           for(int j=(n-1);j>=Math.abs(i);j--)
	           {
	               System.out.print(" *");
	           }
	           System.out.println();
	       }
	       sc.close();
	 }
	}

