package in.raghava.programspractice.small;
import java.util.Scanner;

public class Lcm3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int i=a<b? (a<c? a:c):(b<c? b:c);
		while(true){
			
			if(a%i==0&&b%i==0&&c%i==0) 	break;
			i--;
		}
		System.out.println(i);
		
	}

}
