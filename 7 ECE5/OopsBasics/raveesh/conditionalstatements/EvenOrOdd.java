import java.util.Scanner;


class EvenOrOdd 
{
	public static void main(String[] args) 
	{	Scanner om = new Scanner(System.in);
		System.out.print("Enter a num:");
		int num=om.nextInt();
		if (num%2==0)
		{
			System.out.println(num+"  is a Even number");
		}
		else
		{
			System.out.println(num+ "is a odd number");
	
		}

		System.out.println(" Thank you for choosing me");
	}

}