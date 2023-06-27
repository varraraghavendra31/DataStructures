package edu.sai;

public class Swap {
	    public static void main(String[] args) {
	        int a1 = 10;
	        int b1= 20;

	        // swap numbers code
//	        int temp = a;
//	        a = b;
//	        b = temp;

	        swap(a1, b1);

	        System.out.println(a1 + " " + b1);
//
//	        String a = "Kunal Kushwaha";
//	        changeName(a);
//	        System.out.println(a);
//	    }
//
//	    static void changeName(String a) {
//	        a="rahul anna"; // creating a new object
//	        System.out.println(a);
	    }

	    static void swap(int num1, int num2) {
	        int temp = num1;
	        num1 = num2;
	        num2 = temp;
	        // this change will only be valid in this function scope only.
	    }
	}



