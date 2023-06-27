package association;

public class CarPlayer {
 MusicPlayer p;
 String name;
 int carNum;
 public CarPlayer(String name,int carNum) {
	 this.name=name;
	 this.carNum=carNum;
	 
 }
 public void carDetails() {
	 
	 if (p !=null)
	 p.display();
	 System.out.println("car name: "+name);
	 System.out.println("car number: "+carNum);
	 System.out.println("********************");
 }
	 
 
}
