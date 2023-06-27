package com.linkedlist;

class LinkedList {
	private Node first;
	private int count=0;
	
	public void add(Object e) {
		if(first==null) {
		first =new Node(e,null);
		count++;
		return;
	    }
		Node curr=first;
		while(curr.next!=null) {
			curr=curr.next;
		}
		curr.next=new Node(e,null);
		count++;
	}
	public void add(int index,Object e) {
		if(index<=-1||index>=size()) {
			throw new IndexOutOfBoundsException();
		}
		if(first==null) {
			first =new Node(e,null);
			count++;
			return;
		}
		Node curr=first;
		for(int i=1;i<index;i++) {
			curr=curr.next;
		}
		curr.next=new Node(e,curr.next);
		count++;
	}

	public Object get(int index) {
		if(index<=-1||index>=size()) {
			throw new IndexOutOfBoundsException();
		}
		Node curr =first;
		for(int i=0;i<index;i++) {
			curr=curr.next;
		}
		return curr.ele;
	}
	
	public void remove(int index) {
		if(index<=-1||index>=size()) {
			throw new IndexOutOfBoundsException();
		}
		if(index==0) {
			first=first.next;
			count--;
			return;
		}
		Node curr=first;
		for(int i=1;i<index;i++) {
			curr=curr.next;
		}
		curr.next=curr.next.next;
		count--;
	}
	
	public void reverse() {
		Node prev=null;
		Node curr=first;
		Node next=null;
		while(curr!=null) {
			next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;
		}
		first=prev;
	}

	public int size() {
		return count;
	}
}
public class TestLinkedList {
public static void main(String[] args) {
	LinkedList l=new LinkedList();
	l.add(10);
	l.add(20);
	l.add(30);
	l.add(40);
	l.add(50);
//	for(int i=0;i<l.size();i++) {
//		System.out.print(l.get(i)+" ");
//	}
//	l.remove(3);
//	l.add(3,100);
	System.out.println(l.size());
	for(int i=0;i<l.size();i++) {
		System.out.print(l.get(i)+" ");
	}
	
	
	
}
}