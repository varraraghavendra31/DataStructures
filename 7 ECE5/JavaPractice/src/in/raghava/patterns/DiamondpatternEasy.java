package in.raghava.patterns;

public class DiamondpatternEasy {
	public static void main(String[] args) {
		pattern();
	}
	static void pattern() {
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i+1;j++)
				{
				System.out.print("  ");
				}
			for(int j=1;j<=2*i-1;j++)
				{
				System.out.print(" *");
				}
			System.out.println();
			}
		for(int i=2;i<n+1;i++) {
			for(int j=1;j<=i;j++)
				{
				System.out.print("  ");
				}
			for(int j=i;j<=2*n-i;j++)
				{
				System.out.print(" *");
				}
			System.out.println();
			}

}
}
