package com.jsp.SuperPack;
class Parent{
	int i1,j2;
	Parent(){
		
	}
	public Parent(int i,int j) {
		this.i1=i;this.j2=j;
	}
	public void display() {
		System.out.println("i1="+i1+"\n"+"j2="+j2);
	}
}
class Child extends Parent
{
	int i,j;

	public Child(int i, int j) {
//		this.i = i;
//		this.j = j;
//		super( i, j);
		super.i1=i;
		super.j2=j;
	}
	@Override
	public void display() {
		System.out.println("i="+i+"\n"+"j="+j);
	}
	
	
	
}
public class AssigningValuesToParentDataMembers {
public static void main(String[] args) {
	Parent p = new Parent(20,30);
	p.display();
}
}
