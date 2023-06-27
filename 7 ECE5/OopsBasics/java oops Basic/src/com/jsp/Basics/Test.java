package com.jsp.Basics;
/*class Demo{
	static int k;
	int j;
	int i;
	
}
class Memo{
	static int k=67;
}


public class Test {
	public static void call(int a) {
		System.out.println(a);
	}

	public static void main(String[] args) {
		Demo d1=new Demo();
		System.out.println(d1);
		Demo d2=new Demo();
		System.out.println(d2);
		System.out.println(d1.i+"+"+d1.j);

		System.out.println(d2.i+"+"+d2.j);
		d1.i=78;
		d2.j=100;
		System.out.println(d1.i+"+"+d1.j);

		System.out.println(d2.i+"+"+d2.j);
		
		
		
		
			d1.j=78;
			call(d1.j);
			call(Demo.k);
			call(Memo.k);
			System.out.println("========================================================");
	
	}
	
}*/
/*
class Demo{

	int c;
	int d;

}


public class Test {

	public static void main(String[] args) {
		Demo d1=new Demo();
		System.out.println(d1);
		Demo d2=new Demo();
		System.out.println(d2);
		System.out.println(d1.c+"+"+d1.d);

		System.out.println(d2.c+"+"+d2.d);
		d1.i=78;
		d2.j=100;
		System.out.println(d1.c+"+"+d1.d);

		System.out.println(d2.c+"+"+d2.d);
		System.out.println("--------------------------------------------------------------------");
		
		
	}
		
	
	}*/
class Demo{

	static int k;
	

}


public class Test {

	public static void main(String[] args) {
		Demo d1 = new Demo();
		System.out.println(d1);
		Demo d2=new Demo();
		System.out.println(d2);
		
		System.out.println(d1.k);
		System.out.println(Demo.k);
		System.out.println(d2.k+"\n");
		
		d1.k=178;
		
		System.out.println(Demo.k);
		System.out.println(d1.k);
		System.out.println(d2.k+"\n");

		Demo.k=198;
		System.out.println(Demo.k);
		System.out.println(d1.k);
		System.out.println(d2.k);
		

		System.out.println("--------------------------------------------------------------------");
		
		
	}
		
	
	}

	



