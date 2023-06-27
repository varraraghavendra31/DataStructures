package patternNumeric;
public class RemoveDuplicate{
	public static void main(String[] args)
	{
		System.out.println("hello");
		String s="abbccdd";
		String a="";
//		System.out.println(a.length());
		for(int i=0;i<s.length();i++){
			char ch=s.charAt(i);
			if(a.length()==0) {
				a+=s.charAt(i)+"";
//				i++;
				}
			for(int j=0;j<a.length();j++) {
				if(a.charAt(j)!=s.charAt(i)) {
					a+=s.charAt(i)+"";
					i++;
					break;
					
				}
			}
		}
		System.out.println(a);
	}
		
		
	}

	
