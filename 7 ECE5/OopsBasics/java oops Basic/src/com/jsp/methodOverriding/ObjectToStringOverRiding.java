package com.jsp.methodOverriding;
class A extends Object{
	int i;

	public A(int i) {
		this.i = i;
	}

	@Override
	public String toString() {
		return "A [i=" + i +  "]";
	}
	
	
}
public class ObjectToStringOverRiding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A(10);
		System.out.println(a);
		A a2 = new A(20);
		System.out.println(a2.toString());
	}

}
