package com.jsp.methodOverriding;
class R{
	int i;
	public R(int i) {
		this.i=i;
		
	}
}
public class RelationalEqualOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=20;
		System.out.println(a==b);
		System.out.println("*************");
		
		R a1 = new R(30);
		R a2 = new R(30);
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a1==a2);
		System.out.println("************");
		System.out.println(a1.i==a2.i);
//		System.out.println(a1.i==a2);
		
		

	}

}
