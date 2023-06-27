package com.arrays;
import java.util.Scanner;


public class CheckVowel {

	 public static void main(String[] args) {
	  Scanner cs=new Scanner(System.in);
	  char alphabet;
	     System.out.println("Enter an alphabet:");
	    alphabet=cs.next().charAt(0);//it is not necessary to specify that type for reading a character

	     switch(alphabet)
	     {
	     case 'a':
	     case 'A':
	     case 'e':
	     case 'E':
	     case 'i':
	     case 'I':
	     case 'o':
	     case 'O':
	     case 'u':
	     case 'U':
	         System.out.println("It is vowel");
	         break;
	     default:
	        System.out.println("It is consonant");
	  cs.close();
	 
		

	}

}
}
