package com.jsp.SuperPack;
class A{
	A(){
		System.out.println("hi");
	}
	A(int i){
		System.out.println("i="+i);
	}
	public void m1() {
		System.out.println("java is good");
		System.out.println("java is easy");
	}
	public void m2() {
		System.out.println("hello my name is raghava");
		
	}
}
class B extends A{
	B(){
		super(10);
	}
	@Override
	public void m1() {
//		this.m1();
		super.m1();
		super.m2();
		
	}
}
public class SuperAccessMethodDataMembers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b = new B();
		b.m1();

	}

}
