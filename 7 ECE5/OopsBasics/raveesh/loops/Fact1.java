
import java.util.Scanner;
class Fact1
{
	public static void main(String[] args) 
	{	Scanner os=new Scanner(System.in);
		System.out.print("Enter a num:");
		int n=os.nextInt();
		int i=1;
		int	prod=0;
		for (;i<=n ;i++ ){
		
			prod+=i;
		}
		System.out.println(" factorial of " +n+ " is " +prod );
	}
}