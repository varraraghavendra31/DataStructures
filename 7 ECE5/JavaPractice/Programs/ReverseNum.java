import java.util.Scanner;
class ReverseNum 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a num: ");
		int n=sc.nextIssnt();

		int m=n;//to store the n before deletionm .. after operation
		int reverse=0;
		while(n>0)
		{
			reverse = (reverse*10)+(n%10);//to add reverse of num
			//n%10 to get lastdigit of a num
			n /=10;//to remove last digit of a num
			
		}
		System.out.println("Reverse of a num: "+reverse);
	}
}
