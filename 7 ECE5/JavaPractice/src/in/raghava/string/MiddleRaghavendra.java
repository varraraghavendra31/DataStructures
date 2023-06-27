package in.raghava.string;
import java.util.Scanner;
public class MiddleRaghavendra {

	public static void main(String[] args) {
		System.out.println("enter name");
		String str=new Scanner(System.in).next();
		int n=str.length();
		char b;
		if(n%2==0) {
			 b=str.charAt((n/2)-1);
		}
		else
		 b=str.charAt(n/2);
		
		b=(char)(b-32);
		System.out.println(b);

	}

}
