package in.raghava.programspractice.small;

abstract class A {
	abstract void m1();
}

class B extends A {
	@Override
	public void m1() {
		System.out.println("m1 FROM B");
	}
}

public class Demo {
	public static void main(String[] args) {
		A a = new B();
		a.m1();
	}

}
