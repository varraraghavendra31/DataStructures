package com.jsp.AccessModifiers;

public class CommandLineArguments {

	public static void main(String[] arr) {
		// TODO Auto-generated method stub
		int num1=Integer.parseInt(arr[0]);
		System.out.println("num1"+num1);
		
		int num2=Integer.parseInt(arr[1]);
		System.out.println("num2:"+num2);
		
		int result =num1+num2;
	System.out.println("num1"+"+"+"num2"+"="+result);
		

	}

}
