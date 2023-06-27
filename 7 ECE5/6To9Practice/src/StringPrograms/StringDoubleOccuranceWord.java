package StringPrograms;

public class StringDoubleOccuranceWord {
	public static void main(String[] args) {
		String s = "google bleed blood ";
		char[] a = s.toCharArray();
		int count=0;
		String s1="";
		for(int i=0;i<a.length;i++) {
			if(i==a.length-1)break;
			if(a[i]==a[i+1]) {
				
				String n=a[i]+""+a[i+1];
				s1=n;
				count++;
			}
			System.out.println(s1+" "+count);
			s1="";
		}
		
		

	}
}
