package com.datastructures;

class Nodes{
	Object ele;
	Nodes next;
	Nodes prev;
	public Nodes(Object e) {
		ele =e;
	}
	public Nodes(Object e,Nodes n,Nodes p) {
		ele=e;
		next =n;
		prev=p;
	}	
}
class DoubleLinkedList{
	private Nodes first = null;
//	private Nodes last;
	private int count = 0;
	
	public void add(Object e) {
		if(first==null) {
			first=new Nodes(e);
			count++;
			return;
		}
		Nodes curr=first;
		while(curr.next!=null) {
			curr=curr.next;
		}
		curr.next=new Nodes(e,null,curr);
		count++;
	}
	public void add(int index,Object e) {
		if(index<=-1||index>=size()) {
			throw new IndexOutOfBoundsException();
		}
		if(index==0) {
			Nodes n=new Nodes(e,null,first);
			first.prev=n;
			first=n;
			count++;
			return;
		}
		Nodes curr=first;
		for(int i=1;i<=index;i++) {
			curr=curr.next;
		}
		Nodes n=new Nodes(e,curr.next,curr);
		curr.next.prev=n;
		curr.next=n;
		count++;
	}
	public int size() {
		return count;
	}
	public Object get(int index) {
		if(index<=-1||index>=size()) {
			throw new IndexOutOfBoundsException();
		}
		Nodes curr=first;
		for(int i=1;i<=index;i++) {
			curr=curr.next;
		}
		return curr.ele;
	}
	public void forwardTravers() {
		Nodes curr=first;
		while(curr!=null){
			System.out.print(curr.ele+" ");
			curr=curr.next;
		}
		System.out.println();
	}
//	public void reversTraverse() {
//		Nodes curr=last;
//	}
	
}
public class TestDoubleLinkedList {
public static void main(String[] args) {
	DoubleLinkedList d=new DoubleLinkedList();
	d.add(10);
	d.add(20);
	d.add(30);
	d.add(40);
	d.add(50);
	for(int i=0;i<d.size();i++) {
		System.out.println(d.get(i));
	}
	System.out.println("************************");
	d.add(2,60);
	for(int i=0;i<d.size();i++) {
		System.out.println(d.get(i));
	}
	
}
}
