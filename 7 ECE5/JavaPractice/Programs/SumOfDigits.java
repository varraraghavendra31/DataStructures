import java.util.Scanner;
class  SumOfDigits
{
	public static void main(String[] args) 
	{	Scanner sc=new Scanner(System.in);
		System.out.println("Enter anumber: ");
		int n=sc.nextInt();

		int sum=0;
		while(n>0){
			sum += (n%10);//for getting last digit of anum
			n/=10;//to remove lastdigit of a number
		}
			System.out.println(sum);
	}
}
