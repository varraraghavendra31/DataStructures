package blocks;
class Object{
	static int i;
//	static
//	 {
//		i++;
//	 }
	
	{
		i++;
	}
	
}
public class CountNoObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object o1=new Object();
		Object o2=new Object();
		Object o3=new Object();
		Object o4=new Object();
		System.out.println("no of objects: "+Object.i);
		

	}

}
