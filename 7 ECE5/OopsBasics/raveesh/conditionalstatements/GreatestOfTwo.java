import java.util.Scanner;

class GreatTwo 
{
	public static void main(String[] args) 
	{	Scanner os=new Scanner(System.in);
		System.out.println("Enter number1:");
		int a=os.nextInt();
		System.out.print("Enter number 2: ");
		int b=os.nextInt();
		
		if(a>b) System.out.println(a+" is a bigger");

		else if (b>a) System.out.println(b+" is bigger");

		else System.out.println("both are equal");
		System.out.println("thank you");
	}

}

