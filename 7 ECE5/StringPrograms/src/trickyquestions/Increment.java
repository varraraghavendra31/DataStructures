package trickyquestions;
import java.util.Scanner;
public class Increment {
	private static void m1(int i){
		int k=i;
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=1;
		int b=0;
		m1(a);
		b=a++ + ++a + a++ + ++a + a++ + a++ + ++a + ++a;
		System.out.println(b+" inc "+a);
	}

}
