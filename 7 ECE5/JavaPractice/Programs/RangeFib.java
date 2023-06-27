import java.util.Scanner;
class RangeFib 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter two num: ");
		int num1=sc.nextInt();//20
		int num2=sc.nextInt();//250

		int a=0,b=1,n;// 0 1 1 
		//fibonacci series means addding of previous input for the next output
		while (a<num2)
		{
		
			if (a>num1){
				System.out.print(a+" ";
			}
			n=a+b;
			a=b;
			b=n;


		}
		
	}
}
