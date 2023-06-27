package in.raghava.patterns;

public class PatternX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		for(int row=1;row<=n;row++) {
			for(int col=1;col<=n;col++) {
				if(col==row || col+row==n+1) 
				{
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
	}

}
}
