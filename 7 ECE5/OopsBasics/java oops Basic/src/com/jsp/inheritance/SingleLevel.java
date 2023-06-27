package com.jsp.inheritance;
class A{
	int i;
	{
		i=10;
	}
	public void m1() {
		System.out.println("java for life");
	}
}
class B extends A{
	int j=45;
	public void m2() {
		System.out.println("java is easy");
		System.out.println(i);
		System.out.println(j);
	}
	
}
public class SingleLevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b = new B();
		b.m2();
		System.out.println("*******************************");
		System.out.println(b.i);
		System.out.println(b.j);
		b.m1();
		
	}

}
