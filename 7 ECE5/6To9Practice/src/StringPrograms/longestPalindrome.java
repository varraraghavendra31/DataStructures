package StringPrograms;

import java.util.Scanner;

public class longestPalindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a string ");
		String s = sc.next();
		String res="";
		for (int i = 0; i < s.length()-1; i++) {
			for (int j = i + 1; j < s.length(); j++) {
				if (isPalindrome(s, i, j))
					if(res.length()<s.substring(i, j + 1).length()) {
						res=s.substring(i, j + 1);
					}
			}
		}
		System.out.println(res);
	}

	public static boolean isPalindrome(String s, int start, int end) {
		char[] ch = s.toCharArray();
		int i = start;
		int j = end;
		for (; i < j; i++, j--)
			if (ch[i] != ch[j])
				return false;
		return true;
	}
}
