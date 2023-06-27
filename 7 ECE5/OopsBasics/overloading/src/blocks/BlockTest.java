package blocks;
class Block{
	int i;
	static int j;
	static int j1;
	static{
		System.out.println("hi i am static block");//intializers
		j=200;
	}
	
	{
	System.out.println("hi iam non static block");	
	i=300;
	j1=500;
	}
}
public class BlockTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("hello main");
//		System.out.println(new Block().i);
		Block b1=new Block();
		System.out.println(b1.i+"\n");
		System.out.println(b1.j+"\n");
		System.out.println(b1.j1);
	}

}
