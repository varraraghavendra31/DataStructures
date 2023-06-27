package trickyquestions;
import java.util.Scanner;
public class SwitchCase {
public static void main(String[] args) {
	System.out.println("enter a choice");
	char n=new Scanner(System.in).next().charAt(0);
	System.out.println("hii");
//	we can use return in main method also
//	return;
	/*switch can allow byte  int   short long String char and enum also
	 * 
	 * it can not allow float double boolean
	 */
	switch(n) {
	case 'a':{
		System.out.println("monday");
	}
	break;
	case 'e':
	{
		System.out.println("mofshdbnday");
		break;
//		System.out.println("hello");
	}
	case 'i':
		System.out.println("tues day");
		System.out.println("hello hii");
		System.out.println("tues day");
		System.out.println("hello hii");
		System.out.println("tues day");
		System.out.println("hello hii");
		System.out.println("tues day");
		System.out.println("hello hii");
		break;
	case 'o':
		System.out.println("wednes day");
		break;
	default:
		System.out.println("thurs day");
		System.out.println("tues day");
		System.out.println("hello hii");
		System.out.println("tues day");
		System.out.println("hello hii");
		System.out.println("tues day");
		System.out.println("hello hii");
		System.out.println("tues day");
		System.out.println("hello hii");
	
	}
}
}
