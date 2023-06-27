package in.raghava.programspractice;

public class DecToBinary {
	public static void main(String[] args) {
		int n=8;
		int binary=n;
		int rem;
		int rev=0,temp=1;
		while(n>0) { 
////		reversing a number
//			rem=n%10;
//			n /=10;
//			rev=10*rev+rem;
			
			
////  decimal to binary
			rem=n%2;
			n /=2;
			rev=temp*rem+rev;
			temp = temp * 10;

						
		}
		System.out.print("binary of: "+binary +" = "+rev);
		
	}

}

