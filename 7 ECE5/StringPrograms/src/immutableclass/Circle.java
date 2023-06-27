package immutableclass;

public class Circle {
	/*immutable class fields private and final
	 * setter method returns object
	 * */
	private final int radius;
	
	public Circle(int r) {
		radius=r;
	}

	public int getRadius() {
		return radius;
	}

	public Circle setRadius(int r) {
		return new Circle(r);
	}
	public static void main(String[]args) {

	Circle c1 = new Circle(10);
	Circle c2=new Circle(20);
	System.out.println(c1+" , "+c2);
	System.out.println(c1.getClass().getSimpleName());
	System.out.println(c1.getClass());
	}
	
}
