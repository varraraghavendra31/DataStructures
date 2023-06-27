package com.jsp.methodOverriding;
class Q{
	public Q(){
		System.out.println("no arg con of Q");
	}
}
class D extends Q{
	public D() {
		System.out.println("no arg constructor of D");
	}
}
public class ConstructorWithSuper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new D();
	}

}
