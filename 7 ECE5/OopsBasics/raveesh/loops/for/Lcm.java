import java.util.Scanner;
class Lcm 
{
	public static void main(String[] args) 
	{	Scanner os=new Scanner(System.in);
		System.out.println("Enter two num:");
		int a=os.nextInt();
		int b=os.nextInt();

		//int n=1;
		int n=a>b? a:b;
		while(true){
			if (n%a==0 && n%b==0) break;
			n++;
		}
		System.out.println("lcm of two numbers "+a+" and "+b+ " is " +n);
	}
}
