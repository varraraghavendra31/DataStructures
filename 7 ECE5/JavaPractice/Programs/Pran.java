import java.util.Scanner;
class Pran 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a range:");
		int b=sc.nextInt();
		
		for (int i=1;i<=b;i++ )
		{	
			int sum=1;
			int num=i;
			for (int j=2;j<=i/2 ;j++ )
			{
				if (i%j==0) sum +=j;	
			}
			if (sum==i) System.out.println(i);
		}
		
	}
}