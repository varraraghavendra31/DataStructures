import java.util.Scanner;
class StringsFact
{
	public static void main(String[] args) 
	{	Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextShort();
		 short prod=1;
		 int i=1;
		 String s="";
		 for (s;i<=n;i++ ){
			 prod*=i;
			 s+=i;
		 	if (i<n)
				s+=i +"*";
		 
	}

	System.out.println(prod);
	System.out.println(s);
	System.out.println(s+ " = " +prod);
	}
}
