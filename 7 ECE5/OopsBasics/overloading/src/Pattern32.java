import java.security.DomainCombiner;

public class Pattern32 {
	public static void main(String[] args) {
		int n=9;
		int space=n/2;
		int star=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=space;j++) {
				System.out.print("h");
			}
		
			for(int j=1;j<=star;j++) {
				if(j==1||j==star) {
					System.out.print("*");
				}
				else
						System.out.print(" ");
			}
			if(i<=n/2) {
				star+=2;
				space--;
			}
			if(i>n/2) {
				star-=2;
				space++;
			}
			System.out.println();
			
		}
		
	}

}