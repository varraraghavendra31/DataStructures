import java.util.Scanner;

class CurrencyCalc 
{
	public static void main(String[] args) 
	{
		System.out.println("enter amount in multiples of 100:");
		Scanner sc=new Scanner(System.in);
		int amt=sc.nextInt();
		if(amt >= 2000) {
			System.out.println("2000 x "+(amt/2000));
			amt=amt%2000;
		}
		if (amt>=500){
		    System.out.println("500 x "+(amt/500));
			amt=amt%500;
			}
		if (amt>=200){
		    System.out.println("200 x "+(amt/200));
			amt=amt%200;
		    }if (amt>=100){
		    System.out.println("100 x "+(amt/100));
			amt=amt%100;
		    }
		
			System.out.println("thank you");s


	}
}