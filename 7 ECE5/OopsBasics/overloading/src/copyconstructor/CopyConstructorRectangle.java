package copyconstructor;
class Rectangle{
	int length,breadth;
	public Rectangle(int value){
		this.length=value;
		this.breadth=value;
	}
	public Rectangle(int length,Rectangle r1) {
		this.length=length;
		this.breadth=r1.breadth;
	}
	public Rectangle(Rectangle r2,int length) {
		this.length=length;
		this.breadth=r2.breadth;
	}
	public Rectangle(Rectangle r2,int breadth,boolean b) {
		this.length=r2.length;
		this.breadth=breadth;
	}

	
	
	public void displayArea() {
		System.out.println("length: "+length+" "+"breadth: "+breadth);
		System.out.println("Area: "+length*breadth+"\n *****************************");
	}
}
public class CopyConstructorRectangle {
	public static void main(String[] args) {
		Rectangle r1=new Rectangle(5);
		r1.displayArea();
		
		Rectangle r2=new Rectangle(7,r1);
		r2.displayArea();
		
		Rectangle r3=new Rectangle(8,r2);
		r3.displayArea();
		
		Rectangle r4=new Rectangle(r3,4,false);
		r4.displayArea();
		
		
		
	}

}
