package com.jsp.Basics;
import java.util.Scanner;
 class Rectangle {
	 int length;
	 int breadth;
	 int area;
	 
	 public void intia(int a,int b) {
		 length=a;
		 breadth=b;
	
	 }
	 public void Display() {
		 System.out.println("length:"+length);
		 System.out.println("breadth"+breadth);
	 }
	 public void area() {
		 area=length*breadth;
		 System.out.println("area of rectangle : "+area);
	 }
	 
	 
	 public static void main(String[] args) {
		
	
	System.out.println("enter length");
	Scanner sc=new Scanner(System.in);
	Rectangle r1 = new Rectangle();
//	int l=sc.nextInt();
//	int b=sc.nextInt();
	r1.intia(20,30);
	r1.Display();
	r1.area();
	System.out.println("---------");
	Rectangle r2 = new Rectangle();
	r2.intia(30,40);
	r2.Display();
	r2.area();
	
	
	
	
	
	
	 }
	
}
