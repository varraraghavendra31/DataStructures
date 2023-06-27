package immutableclass;
final class A{
    private int i;
	A(int i){
		this.i=i;
	}
	A m1(int i) {
		if(this.i!=i)
			return new A(i);
		return this;
	}
}
public class Immutable {

	public static void main(String[] args) {
		 A a=new A(10);
		 A a1=a.m1(20);
		 A a2=a.m1(10);
		 System.out.println(a);
		 System.out.println(a1);
		 System.out.println(a2);
		 System.out.println(a==a2);

	}

}
