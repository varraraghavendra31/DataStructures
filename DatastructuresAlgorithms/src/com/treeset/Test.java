package com.treeset;

public class Test {
public static void main(String[] args) {
	BinarySearchTree b=new BinarySearchTree();
	b.add(15);
	b.add(40);
	b.add(60);
	b.add(30);
	b.add(80);
	b.add(50);
	b.add(10);
	b.levelTraverse();
	
}
}
