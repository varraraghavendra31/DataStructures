import java.util.Scanner;
class DiamondPattern
{
	public static void main(String[] args) 
	{
		System.out.println("Enter a number:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<n;i++){
			for(int j=1;j<n-1;j++)
				System.out.print(" ");

			for(int k=1;k<=i;k++){
				System.out.print("*"+" ");
			}System.out.println();

		}
		

	}
}
