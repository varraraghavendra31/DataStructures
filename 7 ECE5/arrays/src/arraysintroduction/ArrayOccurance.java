package arraysintroduction;

public class ArrayOccurance {
public static void main(String[] args) {
	//System.out.println("enter an array");
	int[]a= {2,2,3,5,6};
	int lar=0;
	int d=0;
	for(int i=0;i<a.length;i++) {
		int count=0;
		int sum=0;
		int b=a[i];
		for(int j=0;j<a.length;j++) {
			int c=a[j];
			if(b==c)count++;
		}
		if(count>2){
		if(count==b) sum+=b;
	}
	while(sum>0) {
	 d=sum%10;
	if(d>lar) lar=d;
		
}
	System.out.println(d);
}
}
}
