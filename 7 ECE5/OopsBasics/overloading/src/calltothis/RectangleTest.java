package calltothis;
class Rectangle{
	int length,breadth;
	public Rectangle(int length,int breadth) {
		this.length=length;
		this.breadth=breadth;
	}
	public Rectangle(int num) {
		this( num, num);
	}
	public void displayDetails() {
		System.out.println("length: "+this.length+" breadth: "+breadth);
		calcArea();
	}public void calcArea() {
		System.out.println("Area is: "+(length*breadth)+"\n*********************************");
		
	}
}
public class RectangleTest {
	public static void main(String[] args) {
		Rectangle r1=new Rectangle(8,6);
		r1.displayDetails();
		
		Rectangle r2=new Rectangle(5);
		r2.displayDetails();
		
		
	}

}
