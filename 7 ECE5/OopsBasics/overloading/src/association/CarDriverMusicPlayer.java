package association;

public class CarDriverMusicPlayer {
public static void main(String[] args) {
	CarPlayer c=new CarPlayer("BMW",208);
	c.carDetails();
	
	MusicPlayer a = new MusicPlayer("Xperia","sony","wired");
	a.display();
	
	c.p=a;
	c.p.name="Marshall";
	c.p.display();
	System.out.println("++++++++++++++++++++");
	c.carDetails();
	
	
	
	
	
}
}
