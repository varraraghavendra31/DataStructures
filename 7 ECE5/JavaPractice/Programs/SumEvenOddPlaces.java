import java.util.Scanner;
class SumEvenOddPlaces 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a num:");
		int n=sc.nextInt();
		int count=0,sumEven=0,sumOdd=0;
		while(n>0){
			if (count%2==0)
			{
				sumEven += n%10;
				}
				else sumOdd += n%10;//to know last digit
				count++;//move place value by 1
				n /=10;//to remove last digit 
				//if u not understand take an example
		}
				System.out.println("Sum of even places  of a  num: "+sumEven);
				System.out.println("Sum of odd places of a number: "+sumOdd);
	}
}
