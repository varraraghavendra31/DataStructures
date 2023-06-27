import java.util.Scanner;

class AgeVerification 
{
	public static void main(String[] args) 
	{	Scanner os=new Scanner(System.in);
		System.out.println("Enter your age in years= ");
		int age=os.nextInt();

		if (age>=21)
		{
			System.out.println("Eligible to vote ");

		}
		System.out.println("Thank You...");
		
	}
}
