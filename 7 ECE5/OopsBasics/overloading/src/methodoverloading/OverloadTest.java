package methodoverloading;
class Garage{
	
	public void service(Pulsar p) {
		
		System.out.println(p.fuelcapacity);
		System.out.println(p.engineType);
		System.out.println(p.gears);
		System.out.println("wash pulsar");
	}
	public void service(Apache a) {
		System.out.println("**********************************************");
		System.out.println(a.fuelcapacity);
		System.out.println(a.engineType);
		System.out.println(a.gears);
		System.out.println("wash Apache");
	}
}

class Pulsar{
	int fuelcapacity=13;
	String engineType="petrol";
	int gears=3;
}
class Apache{
	int fuelcapacity=10;
	String engineType="petrol";
	int gears=5;
}
public class OverloadTest {
	public static void main(String[] args) {
//		Pulsar z=new Pulsar();
		Apache q = new Apache();
		Garage gar=new Garage();
		gar.service(new Pulsar());
		gar.service(q);
		
	}
	
	

}
