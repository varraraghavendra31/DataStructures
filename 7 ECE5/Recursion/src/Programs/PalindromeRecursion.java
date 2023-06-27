package Programs;

public class PalindromeRecursion {
public static void main(String[] args) {
//	String s=palindrome("malayalam");
//	System.out.println(s);
//}
//static String palindrome(String s) {
//	int n=s.length();
//	if(n==1) return "its a palinmdrome";
//	if(s.charAt(0)==s.charAt(n-1)) {
//		s=s.substring(1,n-1);
//		palindrome(s);
//	}
//	else
//      	return "it's not a palindrome"; 
//      return "it's a palindrome";
//}


	String s="a";
	System.out.println(palindrome(s,0,(s.length()-1)));;
}
static boolean palindrome(String s,int i,int j) {
	if(i>=j) return true;
	if(s.charAt(i)!=s.charAt(j)) return false;
		return palindrome(s,i+1,j-1);
	
      	 
}
}
