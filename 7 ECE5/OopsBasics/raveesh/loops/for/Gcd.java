import java.util.Scanner;
class Gcd 
{
	public static void main(String[] args) 
	{	Scanner sc=new Scanner(System.in);
		System.out.println("Enter two num:");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
			
		int n=num1>num2? num1:num2;
		for (;n>=1;n-- )
		{
				if (num1%n==0 && num2%n==0) break;
				n--;
		}
		System.out.println(n);
		System.out.println(thank you);
	}
}