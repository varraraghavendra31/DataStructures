package regex;

public class TrianglePattern {
	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++) {
			
		for(int i1=n-i;i1>=1;i1--) System.out.print("j");
		
		for(int j=1;j<=2*i-1;j++) {
			if(j==1||j==2*i-1||i==n)System.out.print("*");
			else System.out.print(" ");
		}
		System.out.println();
		
		
	}
	}
}


