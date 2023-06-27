package in.raghava.string;

public class SpaceTrimExample {
public static void main(String[] args) {
	System.out.println("enter a line");
	String  s="  java       is very    easy   ";
	s=s.trim();
	String s2="";
	int count=0;
	char[] c=s.toCharArray();
	for(int i=0;i<c.length;i++) {
			
	if(c[i]==' ') 
	{
		count++;
	}
	else if(c[i]!=' ') count=0;
	else if(count!=1&&count>1) {
		s2+=c[i]+"";
		s2=s2.replace(" ","");
		System.out.println(s2);
	}
	else  s2+=c[i]+"";
	
	}
	System.out.println(s2);
}
}
	
	




