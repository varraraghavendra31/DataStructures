package in.raghava.programspractice.small;

public abstract class Rama {
	final static int m11(){
		return 1;
	}
	private static  void m1() {
		System.out.println("hello");
	}
	static String m2() {
		return "rama";
	}
	public static void main(String[] args) {
		System.out.println(m11());
		m1();
		System.out.println(m2());
	}

}
