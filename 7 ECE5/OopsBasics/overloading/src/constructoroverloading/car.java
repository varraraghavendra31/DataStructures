package constructoroverloading;
class Cars{
	String cname;
	int cnum=1000;
	String color;
	Cars(String name,int num){
		this.cname=name;
		this.cnum=cnum;
		this.color="white";
		
	}
	Cars(String name,String color){
		this.cname=name;
		this.cnum=2;
		this.color=color;
		
	}
	Cars(String name){
		this.cname=name;
		cnum=++cnum;
		this.color="white";
		
	}
	public void carDetails() {
		System.out.println(this.cname);
		System.out.println(this.color);
		System.out.println(this.cnum);
		System.out.println("*********************************8");
	}
	
	
	
}

public class car {
	public static void main(String[] args) {
		Cars c1=new Cars("bmw");
		Cars c2 = new Cars("tata","black");
		Cars c3 = new Cars("maruthi");
		
		c1.carDetails();
		c2.carDetails();
		c3.carDetails();
		
		
	}

}
