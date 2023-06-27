package basicsStrings;

public class LengthOfString {
	public static void main(String[] args) {
		//length is a method in strings
		String s="1234";
		String s2="askbdgaihgf53hjbhf";
		String r = s+s2;
		System.out.println(s.length());
		System.out.println(s2.length());
		System.out.println(r.length());
		System.out.println(r);
		System.out.println(r.charAt(4));
		System.out.println(r.charAt(23));
		System.out.println(r.charAt(-12));
//		System.out.println(r.charAt(3.0));
		System.out.println(r.charAt(3));
	}

}
