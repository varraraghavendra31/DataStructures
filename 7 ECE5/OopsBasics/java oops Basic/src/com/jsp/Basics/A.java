package com.jsp.Basics;

public class A {
int i;//declaring non static variable


public static void changeI() {
	new A().i=900;
	System.out.println(new A().i);//here one more object created 
	A a=new A();
	a.i=9000;
	System.out.println(a.i);
	
}
public static void main(String[] args) {
	System.out.println("good morning");
	A a=new A();
	a.i=45;
	System.out.println(a.i);
	changeI();
}
}
