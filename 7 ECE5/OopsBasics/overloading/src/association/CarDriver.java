package association;

public class CarDriver {
public static void main(String[] args) {
	
	Car c = new Car(new Engine("suzuki",800,"maruthi",1),"benz","black",1000000.0);
	
//	c.carDetails();
	c.e.display();
	c.e.name="v8";
	c.brand="BMW";
	c.carDetails();
	
	
	
}
}
