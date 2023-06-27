import java.util.Scanner;
class PerfectNum 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in) ;
		System.out.print("Enter a  Num:");
		int n=sc.nextInt();
		//1 is also a perfect num
		//no need to write while(n>0)
		int sum=0;
		for (int i=1;i<=n/2 ;i++ ){
			if (n%i==0)
			{
				sum  +=i;
				
			}
		
			}
			if (sum==n) System.out.println(n+" is a perfect num");
			else System.out.println(n+" is not a perfect num");

		

	}
}
