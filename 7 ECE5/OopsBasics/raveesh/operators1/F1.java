import java.util.Scanner;

class Mul
{
	public static void main(String[] args) 
	{	Scanner scn=new Scanner(System.in);
	System.out.println("Enter your number1:");
	int a=scn.nextInt();
	
	System.out.println("Enter your number2:");
	int b=scn.nextInt();

	int Mul=a*b;

	System.out.println(a+ " * " +b+ " = " +Mul);

	//here we take String concatenation takes only two input values at a time and associativity left to riight

	
	System.out.print("multiplication of two numbers "+a+ " and " +b+ " = " +Mul );

		
		
		
	}
}
