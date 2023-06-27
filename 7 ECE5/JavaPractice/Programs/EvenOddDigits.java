import java.util.Scanner;
class EvenOddDigits 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num=scan.nextInt();
		int sumEven=0,sumOdd=0;
		while (num>0)
		{
			int d=num%10;//storing last digit
			if(d%2 !=0) sumOdd +=d;
			else sumEven +=d;
			num /=10;//removing last digit


		}
		System.out.println("sum of even num "+sumEven);
		System.out.println("sum of Odd num "+sumOdd);

	}
}
