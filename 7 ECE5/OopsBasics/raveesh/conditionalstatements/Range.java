import java.util.Scanner;

class Range 
{
	public static void main(String[] args) 
	{	Scanner os=new Scanner(System.in);
		System.out.println("Enter a number:");
		int x =os.nextInt();

		if (x >=50 && x <=100)
			//if one statement used in if or else its not mandatory to write curly braces
			//more than one statement curly braces required
			System.out.println("you won a gift");
			//after if block main starts execute as usual
		System.out.println("visit again...");

	}
}
