package patternNumeric;

public class TrianglePattern {
public static void main(String[] args) {
	int n=10;
	int space=1;
    int	star=n/2;
	for(int i=1;i<=n;i++) {
		for(int j=1;j<star;j++) {
			System.out.print(" ");
		}
		for(int j=1;j<=space;j++) {
			if(j==1||(j==space&&i<=n/2)||i==n/2||(i==n&&j<=n-1)||j==n-1) {
				System.out.print("*");
			}
			else 
				System.out.print(" ");
		}
		space+=2;
		star--;
		System.out.println();
	}
}
}
