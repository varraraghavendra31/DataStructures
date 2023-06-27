package association;

public class Car {
	Engine e;
	String brand;
	String color;
	double price;
	public Car(Engine e,String brand,String color,Double price) {
		this.e=e;
		this.brand=brand;
		this.color=color;
		this.price=price;
		
	}
	public void carDetails() {
		if (e!=null)
			e.display();
		System.out.println("*****************");
		System.out.println("car brand: "+brand);
		System.out.println("car color: "+color);
		System.out.println("car price: "+price);
		
	}
}
