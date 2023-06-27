package StringPrograms;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		System.out.println("enter a string ");
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		boolean flag = false;
		for (int i = 0, j = s.length() - 1; i < j; i++, j--) 
			if (s.charAt(i) == s.charAt(j)) flag = true;
		if(flag)System.out.println("palindrome ");
		else System.out.println("not a palindrome");
	}
}
