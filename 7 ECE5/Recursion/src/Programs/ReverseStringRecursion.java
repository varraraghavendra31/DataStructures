package Programs;

public class ReverseStringRecursion {
public static void main(String[] args) {
	System.out.println(rev("java  is easy"));
}
static String rev(String s) {
	String a ="";
//	if(s.length()<1)return " its  not valid";
	if(s.length()==1)return s;
	a+= s.charAt(s.length()-1)+""+rev(s.substring(0,s.length()-1));
	return a;
}
}
