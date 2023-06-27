package calltothis;
class A{
	A(){
		this(10);
		System.out.println("hi i am no arg constructor");
	}
	A(int i){
		this(10,20);
		System.out.println("hi i am one arg constructor");
	}
	A(int i,int j){
		System.out.println("hi i am two arg constructor ");
	}
}
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 new A(10,20);
	}

}
