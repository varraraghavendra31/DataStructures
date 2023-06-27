//class  
//{
//	public static void main(String[] args) 
//	{
//		System.out.println("Hello World!");
//	}
import java.util.Scanner;
class D 
{
	public static void main(String[] args) 
	{	Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a num:");
		int n= sc.nextInt();
		while (n<200)
		{	System.out.println(n);
			n++;
			//if (n%5==0) continue;		
			if ( n%29==0) break;		
		}
		System.out.println("Thank you");
	}
}

