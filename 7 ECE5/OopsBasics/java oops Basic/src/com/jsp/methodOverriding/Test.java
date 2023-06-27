package com.jsp.methodOverriding;
class Super{
	public void call() {
		System.out.println("parent number 97044398");
		
	}
}
class Sub extends Super{
	public void call() {
		System.out.println("my number 97044239");
		
	}
}
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//it is recommended create child objects
		Sub sub = new Sub();
		sub.call();//run time object
		

	}

}
