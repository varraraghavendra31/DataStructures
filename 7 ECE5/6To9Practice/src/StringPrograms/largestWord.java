package StringPrograms;

public class largestWord {
public static void main(String[] args) {
	String s="raman laxman ram reama  mm alaxmanm";
	s=s+" ";
	int lar=0;
	String s1="";
	String d="";
	int count=0;
	for(int i=0;i<s.length();i++) {
		if(s.charAt(i)!=' '&&i<s.length()) {
			s1+=s.charAt(i);
			count++;
		}
		else {
			if(lar<count) {
				d=s1;
				lar=count;
				
			}
			System.out.println(count);
			count=0;
			s1="";
		}
		
		
	}
	System.out.println(d);
	
}
}