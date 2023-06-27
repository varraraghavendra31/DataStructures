package StringPrograms;

import java.util.Scanner;

public class CountChar {
	public static void main(String[] args) {
		System.out.println("Enter a String");
		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		int upper = 0, lower = 0, special = 0, number = 0;

		for (int i = 0; i < n.length(); i++) {
			char ch = n.charAt(i);
			if (ch >= 'A' && ch <= 'Z')
				upper++;
			else if (ch >= 'a' && ch <= 'z')
				lower++;
			else if (ch >= '0' && ch <= '9')
				number++;
			else special++;
		}
		System.out.println("upper "+upper);
		System.out.println("lower "+lower);
		System.out.println("special "+special);
		System.out.println("number "+number);
	}
}
