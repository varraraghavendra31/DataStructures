import java.util.Scanner;
class SumNum 
{
	public static void main(String[] args) 
	{	Scanner os=new Scanner(System.in);
		System.out.print("Enter a num:");
		int n=os.nextInt();
		int i=1;
		int	sum=0;
		for (;i<=n ;i++ ){
		
			sum+=i;
		}
			System.out.println(sum);
	}
}
