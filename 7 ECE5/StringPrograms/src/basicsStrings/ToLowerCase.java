package basicsStrings;

import java.util.Scanner;

public class ToLowerCase {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter a string in uppercase");
	String s=sc.next();
	System.out.println(s.toLowerCase());
}
}
