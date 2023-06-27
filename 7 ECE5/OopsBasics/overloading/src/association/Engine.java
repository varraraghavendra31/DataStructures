package association;

public class Engine {
	String name;
	int cc;
	String brand;
	int num;
	public Engine(String name,int cc,String brand,int num) {
		this.name=name;
		this.cc=cc;
		this.brand=brand;
		this.num=num;
		
	}
	public void display() {
		System.out.println("Engine name: "+name);
		System.out.println("engine cc: "+cc);
		System.out.println("engine brand: "+ brand);
		System.out.println("Engine: "+num);
	}

}
