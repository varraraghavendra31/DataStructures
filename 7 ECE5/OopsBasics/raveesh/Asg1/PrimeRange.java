import java.util.Scanner;
class PrimeRange 
{
	public static void main(String[] args) 
	{
		System.out.println("enter a number:");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();

		boolean flag;
		for (int i=a;i<=b;i++ ){
			if(i<=1) continue;
			flag=true;
			for (int j=2;j<=i/2;j++ ){
				
				if(i%2==0){
					flag=false;
					break;
				}
			}
			if (flag) System.out.println(i);
		}
	}
}