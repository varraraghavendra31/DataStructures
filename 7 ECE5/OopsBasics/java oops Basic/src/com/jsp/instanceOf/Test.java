package com.jsp.instanceOf;
class Ab extends Object{
	
}
class B extends Ab{
	
}
class M{
	
}
public class Test {
	public static void main(String[] args) {
		Object obj = new Object();
		System.out.println(obj instanceof Object);
		System.out.println(obj instanceof Ab);
		System.out.println(obj instanceof B);
		System.out.println("*********************");
		Ab a = new Ab();
		System.out.println(a instanceof Object);
		System.out.println(a instanceof Ab);
		System.out.println(a instanceof B);
		System.out.println("*********************");
		B b = new B();
		System.out.println(b instanceof Object);
		System.out.println(b instanceof Ab);
		System.out.println(b instanceof B);
		System.out.println("*********************");
		M m = new M();
//		System.out.println(m instanceof Object);
//		System.out.println(m instanceof A);
//		System.out.println(m instanceof B);
//		System.out.println("*********************");
	}
	
}
