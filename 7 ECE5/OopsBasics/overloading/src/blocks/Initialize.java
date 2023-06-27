package blocks;
class Final
{
	final int i;
	final static int j;
	
	static
	{
		j=100;
	}
	{
		i=101;
	}
}
public class Initialize
{
	
	public  void m()
	{
		final int i;
		i=50;
		System.out.println(i);
	}

	public static void main(String[] args)
	{
		
		System.out.println("final usage");
	Initialize a = new Initialize();
		a.m();
		
		Final n=new Final();
		System.out.println(n.i);
		//System.out.println(a.i);
		System.out.println(Final.j);
		
		

	}

}
