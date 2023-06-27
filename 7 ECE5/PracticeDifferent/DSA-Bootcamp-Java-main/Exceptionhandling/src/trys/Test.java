package trys;

public class Test {
	static Test t=null;
	public  void m1() {
		System.out.println("m 1");
	}
public static void main(String[] args) {
	System.out.println("sta 1");
	try {
//		System.out.println(10/2);
		t.m1();
		System.out.println(10/0);
		System.out.println("sta 3");
	}
	catch(ArithmeticException e) {
		System.out.println("hello");
		try{
			System.out.println(10/0);
		}
		catch(ArithmeticException f) {
			System.out.println(f);
		}
		
	}
	catch(NullPointerException e) {
		System.out.println(e);
	}
	catch(Exception e) {
		System.out.println(e);
	}
	System.out.println("sta 2");
	System.out.println(10/0);
	
}
}
