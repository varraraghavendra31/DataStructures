package TwoDarrays;

public class TwoDdiagonalSum {
public static void main(String[] args) {
	int[][]a= {{1,2,3},
			   {4,5,6},
			   {7,8,9}};
	int[][]b= {{1,2,3}
	         , {4,5,6},
	           {7,8,9}};
	int sum=0;
	String sum1="";
	for(int i=0;i<a.length;i++) {
		int x=0;
		for (int j=0;j<a.length;j++) {
			if(i==j) {
				 x= a[i][j]+b[i][j];
				 sum+=x;
				 if(i==0&j==0)sum1+=x;
				 else
				   sum1+="+"+x;
			}
			if(i+j==a.length-1) {
//				if(i==1&&j==1)break;
			   x= a[i][j]+b[i][j];
			   sum+=x;
			   sum1+="+"+x;
			
		}
		}
	}
	System.out.println(sum1+"="+sum);
}
}