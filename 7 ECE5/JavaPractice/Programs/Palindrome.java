import java.util.Scanner;
class Palindrome 
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=scn.nextInt();
		int num=n;

		int m=0;
		while (n>0)
		{
			m=(m*10) + n%10;//ADDING OF A REVERSE OF NUM
			n /=10;//REMOVE LAST DIGIT
			///N%10 getting last digit of a num
		}
			if (m == num) System.out.print("Entered number is a palindrome:"+num);
			
			else System.out.println("Entered num is not  a  palindrome"+num);

	}
}
