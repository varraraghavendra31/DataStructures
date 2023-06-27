package StringPrograms;
import java.util.Scanner;
public class StringPermutation {
	static int  count;
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a string");
	String s=sc.next();
	permutation(s,0,s.length()-1);
	System.out.println("no.of permutations "+count);
	
}

 static void permutation(String s, int start, int end) {
	if(start==end) {
		System.out.print(s+" ");
		count++;
		return ;
	}
	
	for(int i=start;i<=end;i++) {
		String s1=swap(s,start,i);
	    permutation(s,start+1,end);
	}
}

 static String swap(String s, int i, int j) {
	char[]a=s.toCharArray();
	char temp=a[i];
	a[i]=a[j];
	a[j]=temp;
	return new String(a);
}
 public static String swapString(String a, int i, int j) {    
     char[] b =a.toCharArray();    
     char ch;    
     ch = b[i];    
     b[i] = b[j];    
     b[j] = ch;    
     return String.valueOf(b);    
 }       
}
