import java.util.Scanner;
class B 
{
	public static void main(String[] args) 
	{	Scanner sc=new Scanner(System.in);
		System.out.println("Enter a num");
		int i=20;
		for (;i>=1 ;i-- )
		{	
			if (i%3==0) continue;
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("out side for loop ");
	}
}