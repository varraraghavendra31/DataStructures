import java.util.Scanner;

class LeapYear 
{
	public static void main(String[] args) 
	{
		Scanner x=new Scanner(System.in);
		System.out.println("ENTER AN year in num");
		int year=x.nextInt();
		if (year%4==0 && year%100 !=0) System.out.println("leap year");
		else if(year%400==0s) System.out.println("leap year");
		else System.out.println("ordinary year");
	}
}
