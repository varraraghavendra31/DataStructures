package patternNumeric;

public class Program1 {
public static void main(String[] args) {
	int n=10;
	int k=1;
	int b=2*n-2;
	for(int i=1;i<=2*n-1;i++) {
		if(i<=n) {
		for(int j=1;j<=n;j++) {
			if(i==j) {
				System.out.print(k);
				k+=2;
			}
				
			else System.out.print(" ");
		}
		System.out.println();
		
	}
		else if(i>n/2)
		{
			
			for(int j=1;j<=n;j++) {
				if(i+j==2*n) {
					
					System.out.print(b);
					b-=2;
				}
					
				else System.out.print(" ");
			}
			System.out.println();
		}
}
}
}
