package associationAggregationComposition;
import java.util.Scanner;
class Jio{
	String simName;
	public Jio(String simName){
		this.simName=simName;
		
	}
	public void callingFromJio() {
		System.out.println("can access internet while calling through"+simName);
	}
}
class Airtel{
	String simName;
	public Airtel(String simName){
		this.simName=simName;
		
	}
	public void callingFromAirtel() {
		System.out.println("can access internet while calling through "+simName);
	}
}
class Battery{
	String batteryName;
	public Battery(String batteryName) {
		this.batteryName=batteryName;
		
	}
	
}
class Phone{
	String phoneName;
	Jio jio;
	Airtel airtel;
	Battery battery;
	
	public Phone(String phoneName,Battery battery)
	{
//		composition class reference passed as an argument
		this.phoneName=phoneName;
		this.battery=battery;
	}
	public void call() {
		System.out.println("1.jio \n2.Airtel");
		Scanner input=new Scanner(System.in);
		int simSelect=input.nextInt();
		input.close();
		
		switch(simSelect)
		{
		case 1:
			jio =new Jio("JIO");
			jio.callingFromJio();
			break;
		case 2:
			airtel=new Airtel("AIRTEL");
			airtel.callingFromAirtel();
//			break;for last statement do not use break
		}
	}
}

public class PhoneDevelop {

	public static void main(String[] args) {
		System.out.println("choose for calling ");
//	Battery b=new Battery("lithium-ion");
//		Phone p=new Phone("nothing",b);
		
   Phone phone1=new Phone("nothing",new Battery("lithium-ion"));
   phone1.call();
   
   

	}

}
