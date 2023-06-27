import java.util.Scanner;
class FibNum
{
	public static void main(String[] args) 
	{	Scanner sc=new Scanner(System.in);
		System.out.println("enter a number:");
		int n=sc.nextInt();
	    int a=0,b=1,c;

		while(a<=n)
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
