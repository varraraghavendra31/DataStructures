package patternNumeric;

public class Acharpattern {
public static void main(String[] args) {
	int n=4;
	for(int i=0;i<n;i++) {
		char ch='A';
		for(int j=1;j<=n-i;j++) {
			System.out.print(ch);
			ch++;
		}
		System.out.println();
	}
}
}
