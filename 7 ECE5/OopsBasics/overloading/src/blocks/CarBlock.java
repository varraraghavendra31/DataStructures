package blocks;

class Cars {
	String cname;
	String color;
	static int cnum;
	
	static
	{
		cnum=1000;
	}
	
	{
		cnum++;
		color="white";
	}
		Cars(String name)
		{
			this.cname=name;
			
		}
		Cars(String name,String color){
			this.cname=name;
			this.color=color;
			
		}
		Cars(String name,String color,boolean b){
			this.cname=name;
			this.color=color;
		}
		public void carDetails() {
			System.out.println(this.cname);
			System.out.println(this.color);
			System.out.println(this.cnum);
			System.out.println("*********************************8");
		}	
		
	}


public class CarBlock {
	public static void main(String[] args) {
		Cars c1=new Cars("bmw");
		c1.carDetails();
		Cars c2 = new Cars("tata","black");
		c2.carDetails();
		Cars c3 = new Cars("maruthi","red",false);
		c3.carDetails();
		
		
	}

}


