import java.util.*;
class C 
{
	public static void main(String[] args) 
	{	Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a num:");
		int n= sc.nextInt();
		for (;n<200 ;n++ )//print n numbers below 100
		{	
			if (n%5==0) continue;//skip current iteration and starts from next iteration
			if ( n%29==0) break;//if break executes exit the loop no statement will be executed
			System.out.println(n);
		}
		System.out.println("Thank you");
	}
}
