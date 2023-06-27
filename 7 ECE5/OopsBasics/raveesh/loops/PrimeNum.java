import java.util.Scanner;
class PrimeNum 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a num:");
		int n=sc.nextInt();
		//here i use if else in else part we arite the for loop
		if (n<=1){
			System.out.println(n+" is not a prime");
			return;
		// i use boolean  is=true;
		//sum int variable i can use it int a=1;
		//here boolean flag=true;
		}
		for (int i =2;i<=n/2;i++ )
		{
			if(n%i==0)
			{
				System.out.println(n+" is not a prime");
				//without writing sop boolean is = false

				//sum int variable i can use it int a=2;

				//here boolean flag=false;

				//here it updates the value

				//here i execute break and write with suitable code
				return;
			}
		}
		//here i check through if else boolean true print prime ,other wise print not prime
		//
		System.out.println(n+"  is a prime");
		
	}
}
