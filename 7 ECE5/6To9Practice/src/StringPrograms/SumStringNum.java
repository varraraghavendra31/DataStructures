package StringPrograms;

public class SumStringNum {
public static void main(String[] args) {
	String s="KHGFg765525425hvhjdck";
	System.out.println(sum(s));
}
public static int sum(String s) {
	int b=0;
	
	char[]a=s.toCharArray();
	for(int i=0;i<a.length;i++) {
		String sum="";
		if(a[i]>='0'&&a[i]<='9') {
			sum+=""+a[i];
		}
		b=parseInt(sum);
		System.out.println(b);
	}
	return b;
}
private static int parseInt(String string) {
	// TODO Auto-generated method stub
	return 0;
}
}
