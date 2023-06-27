import java.util.Scanner;

class VowelOrConsonant 
{
	public static void main(String[] args) 
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter a string:");
		String b=obj.next();

		String s=b.Atchar(0);

		if (s==a || s==e || s==i || s==o || s==u)
		{
			System.out.println( s+" is an vowel ");
		}
		else
		
		{
			System.out.println(s+" enter value is a consonant");
		}
	}
}
