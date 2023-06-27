package com.jsp.inheritance;
class India{
	String name="dhoni";
	public void m1() {
		String name="mahi";
		System.out.println("name:"+name);
		System.out.println("name:"+this.name);
		System.out.println("******************");
	}
	public String getName() {
		String name="mahi";
		return name;
	}
}
class Home extends India{
	String name="mahendra singh";
	public void m2() {
		System.out.println("name:"+name);
		System.out.println("name:"+this.name);
		System.out.println("name:"+super.name);
		System.out.println("name:"+getName());
		
	}
	
}


public class Example2 {
	public static void main(String[] args) {
		India india = new India();
		india.m1();
		Home home = new Home();
		home.m2();
		System.out.println("**************");
		home.m1();
	}

}
