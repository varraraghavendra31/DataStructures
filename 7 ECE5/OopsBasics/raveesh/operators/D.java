public class D 
{static byte count;
short h=3;

	public static void main(String[] args) 
	{	int count=1;
		System.out.println(D.count);
		System.out.println(count);
		System.out.println(count+1);
		D hm=new D();
		System.out.println(hm.h);
		System.out.println(D.count+4);
		System.out.println(count+=5);
	}
}
