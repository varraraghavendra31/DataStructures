package Programs;

public class ReverseWithOutLoop {
public static void main(String[] args) {
	String s="sai";
	m1(s,s.length());
	
}
private static void m1(String s,int i) {
	if(i==0)return ;
	System.out.print(s.charAt(i-1));
	m1(s,i-1);
	return ;
	
	
}
}
