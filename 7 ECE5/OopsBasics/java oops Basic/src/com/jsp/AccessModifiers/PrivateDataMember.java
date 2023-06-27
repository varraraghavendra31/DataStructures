package com.jsp.AccessModifiers;
class B{
	private int i;
	void getI() {
		System.out.println(i);
	}
	
}
class C extends B{
	public void m1() {
		getI();
	}
}
public class PrivateDataMember {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b = new B();
		b.getI();
		C c = new C();
		c.m1();

	}

}
