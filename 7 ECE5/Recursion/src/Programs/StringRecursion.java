package Programs;

public class StringRecursion {
public static void main(String[] args) {
	String s="raghavendra";
	m1(s);
}

public static void m1(String s) {
	String s1="";
	int b=s.length();
	if(b==0)return ;
	int n=b-1;
	char c=s.charAt(n);
	s1+=c+"";
	System.out.print(s1+" ");
	m1(s.substring(0,n));
	
	
}
}
