package Programs;

import java.util.Arrays;

public class SplitAtChar {
public static void main(String[] args) {
	String s="ramu.bhagya.hello";
	int n=0;
	String s1="";
	for(int i=0;i<s.length();i++) {
		if(s.charAt(i)=='.') {
			n=i+1;
			s1+=" ";
		}
			else
				s1+=s.charAt(i);
			
	}
	System.out.println(s1);
}
}
