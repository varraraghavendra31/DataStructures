import java.util.Scanner;

class F 
{
	public static void main(String[] args) 
	{	Scanner scn=new Scanner(System.in);
		System.out.println("Enter number1:");
		int a=scn.nextInt();
		System.out.print("Enter number 2: ");
		int b=scn.nextInt();

		int sum=a+b;

		System.out.println(a+ "+" +b+ "=" +sum);

		System.out.println("sum of " +a+ " + " +b+ " = " +sum);
	}
}
