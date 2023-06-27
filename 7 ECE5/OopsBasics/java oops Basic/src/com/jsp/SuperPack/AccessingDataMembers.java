package com.jsp.SuperPack;
class First{
	int i;
	{
		i=19;
	}
	void m1(){
		int i=28;
		System.out.println(i);
		System.out.println(this.i);
	}
}
class Second extends First{
	int j=1001;
	public void m2() {
		int i=45;
		System.out.println(i);
		System.out.println(this.j);
		System.out.println(super.i);
		
	}
}
public class AccessingDataMembers {
public static void main(String[] args) {
	Second second = new Second();
	second.m2();
	System.out.println("*************");
	second.m1();
}
}
