package association;

public class MusicPlayer {
    String name;
    String brand;
    String type;
    
    public MusicPlayer(String name,String brand,String type) {
    	this.name=name;
    	this.brand=brand;
    	this.type=type;
    	
    }
    public void display() {
    	System.out.println("music player name: "+name);
    	System.out.println("music player brand: "+brand);
    	System.out.println("music player type: "+type);
    }

}
