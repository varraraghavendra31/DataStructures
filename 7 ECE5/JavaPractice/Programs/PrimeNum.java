import java.util.Scanner;
class PrimeNum 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a num:");
		int n=sc.nextInt();

		if (n<=1){
			System.out.println("not a prime");
			return;
		}
		for (int i =2;i<=n/2;i++ )
		{
			if(n%i==0)
			{
				System.out.println("not a prime");
				return;
			}
		}
		System.out.println(n+"  is a prime");
		
	}
}
