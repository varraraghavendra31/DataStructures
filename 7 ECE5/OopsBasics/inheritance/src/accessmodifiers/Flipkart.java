package accessmodifiers;

public class Flipkart {
//	ststic Paytm p;
	static Paytm p=new Paytm();
	public static void main(String[] args) {
		Flipkart.p.payment();
	}
	
}
class Paytm{
	public void payment() {
		System.out.println("debitcard");
	}
}
/* using this main canbe written as " public static void main(String[]args)"
 * 
 * 
 * System.out.println(); here System is a class out is object reference of printStream
 * class
 * 
 * 
 * */
 