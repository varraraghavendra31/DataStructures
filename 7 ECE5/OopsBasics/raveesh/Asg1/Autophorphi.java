
import java.util.Scanner;
public class MainAuto
{
	public static void main(String[] args) {
	    Scanner scn=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=scn.nextInt();
		int num=n, i=10;
		long fact=1;
		
		    fact=n*n;
		    System.out.println(fact);
		    
		   for(i=10;i<=fact;i *=10)
		    {
		    long d=fact%i;
		    
		    if (d==num){ System.out.println(num+"automorphic number:");
		    break;}
		    else System.out.println(num+"not an automorphic number");
		    
		}
    }
}
