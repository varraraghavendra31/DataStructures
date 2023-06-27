import java.util.Scanner;
class ArmStrongnum 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();

		int num=n;
		int count=0;
		//to get length of the digit
		while(n>0)
		{
			count++;
			n /=10;//to remove last digit
		}
		n=num;
		int sum=0;
		while (n>0)
		{
			int d=n%10;
			int prod=1;
			for (int i=1;i<=count ;i++ )
			{
				prod *=d;
			}
				sum +=prod;
				n /=10;
		}
				if (num==sum) System.out.println(num+"  is an armstrong number");
				else System.out.println("Not an armstrong num");
				
				


	}
}
