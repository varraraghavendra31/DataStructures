package numberPrograms;
import java.util.Scanner;
public class FibonacciUsingRecursion {
public static void main(String[] args) {
	System.out.println("hello");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	for(int i=0;i<n;i++) {
		System.out.println( fib(i));
	}
}

public static int fib(int n) {
	if(n==0)return 0;
	if(n==1)return 1;
	return fib(n-1)+fib(n-2);
	
}
}