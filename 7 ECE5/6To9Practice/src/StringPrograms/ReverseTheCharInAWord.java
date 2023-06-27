package StringPrograms;

public class ReverseTheCharInAWord {
public static void main(String[] args) {
		String s = "java is easy";
		char[]a=s.toCharArray();
		String s2 = "";
		for(int i=0;i<a.length;i++){
			int j=i;
			while(i<a.length&&a[i]!=' ') {
				i++;
			}
			int k=i-1;
			while(k>=j) {
				s2+=a[k];
				k--;
			}
			s2+=' ';
		}
		System.out.println(s2);
}
}
