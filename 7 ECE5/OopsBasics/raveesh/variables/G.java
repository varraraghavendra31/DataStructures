class F
{static int i=100;
int j;
}
class G 
{
	public static void main(String[] args) 
	{
		System.out.println("main class of g");
		
		System.out.println(F.i);
		F.i=10;
		 F obj=new F();
		 obj.j=20;
		 System.out.println(obj.j);
		 	System.out.println(F.i);
			obj.i=50;

		 System.out.println(obj.i);




		
		}
	}