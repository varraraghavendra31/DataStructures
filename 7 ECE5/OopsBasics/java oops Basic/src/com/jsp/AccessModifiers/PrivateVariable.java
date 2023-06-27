package com.jsp.AccessModifiers;
class A{
	private int i;
	{
		i=90;
		
	}
	public int getI() {
		return i;
	}
//	public void getI() {
//		System.out.println(i+"i");
//	}
}
public class PrivateVariable {
      public static void main(String[] args) {
    	  A a = new A();
//    	  System.out.println(i);
    	  System.out.println(a.getI());
//    	  System.out.println(a.i);
    	  System.out.println("************");
    	  int i=a.getI();//here i is local variable
    	  System.out.println(i);
    	  System.out.println("*********");
    	  
	
}
}
