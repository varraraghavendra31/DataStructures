import java.util.Scanner;
class Fib 
{
	public static void main(String[] args) 
	{	Scanner sc=new Scanner(System.in);
		System.out.println("enter a number:");
		int n=sc.nextInt();
	    int a=0,b=1,c;

		for (int i=1;i<=n ;i++ )
		{ 
			System.out.print(a +" ");
			c=a+b;
			a=b;
			b=c;
		}
		System.out.println();
		System.out.println("fibonacci series");
	}
}
