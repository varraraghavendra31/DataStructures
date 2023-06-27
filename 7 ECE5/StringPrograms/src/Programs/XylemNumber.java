package Programs;
import java.util.Scanner;
public class XylemNumber {
int  length=1;
public static void main(String[] args) {
	System.out.println("enter a number");
	Scanner sc=new Scanner(System.in);
	XylemNumber x=new XylemNumber();
	int n=sc.nextInt();
	sc.close();
	int m=n;
	int len=x.length(n);
	System.out.println(len);
	long total=n%10+n/len;
	System.out.println(n%10);
	System.out.println(n/len);
	
	n/=10;
	int sum=0;
	while(n>=9) {
		int d=n%10;
		sum +=d;
		n/=10;
	}
	System.out.println(sum);
	if(sum==total) System.out.println("xylem number "+m);
	else System.out.println("not a xylem number");
}

public  int length(int i) {
	while(i>=9) {
		i/=10;
		length *=10;
		
	}
	return length;
		
	
}
}
