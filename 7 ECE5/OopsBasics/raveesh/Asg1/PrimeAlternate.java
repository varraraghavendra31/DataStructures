import java.util.Scanner;
class PrimeAlternate
{
	public static void main(String[] args) 
	{
		System.out.println("enter a number:");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int count=0;
		boolean flag;
		int j;
		for (int i=a;i<=b;i++ ){
			if(i<=1) continue;
			flag=true;
			for (j=2;j<=i/2;j++ ){
				
				if(i%2==0){
					count++;
					flag=false;
					break;
				}
			}
			if (flag){
				if (count%2==0)
				{
					System.out.println(i);
				}
			}
		}
	}
}
