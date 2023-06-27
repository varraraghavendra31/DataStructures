package accessmodifiers;

class First {
	private int i=100;
	protected int j=200;
	void getI() {
	System.out.println(i);
		}
}
class Second extends First{
	public void m1(){
		getI();
	}
}
public class Test{
	public static void main(String[]args) {
		First a= new First();
		a.getI();
		Second b = new Second();
		b.m1();
	}
}