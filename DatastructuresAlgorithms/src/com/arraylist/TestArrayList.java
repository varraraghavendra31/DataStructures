package com.arraylist;
import java.util.Scanner;
interface List{
	void add(Object e);
	
	void add(int index,Object e);//look
	
	void remove(int index);//look
	
	int size();
	
	Object get(int index);
	
//	void display();
	
//	Object[] clear();
	
}
 class ArrayList implements List{
    private Object[]a;
    private int  p;
    
    public  ArrayList() {
    	a=new Object[5];
    	p=0;
    }
    
    public void add(Object e) {
    	if(p>=a.length)incSize();
    	a[p++]=e;
    }
    
    public void add(int index,Object e) {
    	if(index<=-1||index>=size()) {
    		throw new IndexOutOfBoundsException();
    	}
    	if(p>=a.length)incSize();
    	for(int i=a.length-1;i>=index;i--) {
    		a[i+1]=a[i];
    	}
    	a[index]=e;
    	p++;
    }
    public void remove(int index) {
    	if(index<=-1||index>=size()) {
    		throw new IndexOutOfBoundsException();
    	}
    	for(int i=index+1;i<=size();i++) {
    		try {
    			a[i-1]=a[i];
    		}
    		catch(ArrayIndexOutOfBoundsException e) {
    			System.out.println(e.getMessage());
    		}
    		
    	}
    	p--;
    	a[p]=null;
    }

	public  int size() {
		return p;
	}

	public  void incSize() {
		Object[] temp=new Object[a.length+(a.length+1/2)];
		a=temp;
	}
	
	public Object get(int index) {
		if(index<=-1||index>=size()) {
			throw new IndexOutOfBoundsException();
		}
		return a[index];
	}
	public void display() {
//		try {
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
//	}
//		catch(NullPointerException e) {
//			System.out.println(e);
//		}
	}
	
	public Object[] clear() {
	 Object []temp = null;
	 a=temp;
		return a;
	}
    
    
}
public class TestArrayList{
	public static void main(String[] args) {
	ArrayList l=new ArrayList();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
		l.display();
		l.remove(3);
		System.out.println("*************");
		l.display();
//		l.removeAll();
//		System.out.println("**************");
//		l.display();
	}
}
