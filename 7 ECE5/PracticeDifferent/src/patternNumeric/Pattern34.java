package patternNumeric;

public class Pattern34 {
public static void main(String[] args) {
	int n=5;
	int p=1;
	int x=3;
	int sum=0;
	
	for(int i=1;i<=n;i++) {
		if(i%2!=0) {
			for(int j=1;j<=n;j++)
				{
			System.out.print(j+" ");
			if(p>0) p=p*10+j;
			else p=j;
		}
	}
		else
			for(int j=n;j>=1;j--) System.out.print(j+" ");
		System.out.println();
}
	System.out.println(p);
	for(int j=1;j<=x;j++) {
		int r=p%10;
		sum+=r;
		p/=10;
	}
	
	System.out.println(sum);
}
}
