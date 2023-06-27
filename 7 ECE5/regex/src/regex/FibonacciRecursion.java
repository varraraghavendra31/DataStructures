package regex;
	import java.util.Scanner;
	public class FibonacciRecursion {
		static int FibonacciSeries(int n)
		{
		    if(n==0)
		        return 0;
		    else if(n==1)
		        return 1;
		    else
		        return FibonacciSeries(n-1)+FibonacciSeries(n-2);
		}
		public static void main(String[] args) {
	           Scanner cs=new Scanner(System.in);
	           int n,i;
			    System.out.print("Enter the Limit:");
			    n=cs.nextInt();
			    System.out.print("All Fibonacci Numbers in the given Range are:");
			    for(i=0;i<n;i++)
			    {
			    	System.out.print(FibonacciSeries(i)+" ");
			    }
		        cs.close();
			}
		}
