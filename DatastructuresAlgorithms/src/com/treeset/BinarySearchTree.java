package com.treeset;

import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {
	private Node root;
	private int count;
	private boolean flag;
	public boolean add(int k) {
		flag=true;
		root=addNode(root,k);
		count++;
		return flag;
	}
	public  Node addNode(Node n,int k) {
		if(n==null) {
			n=new Node(k);
			count++;
			return n;
		}
		if(k<n.key) 
			n.left=addNode(n.left,k);
		else if(k>n.key) n.right=addNode(n.right,k);
		else flag=false;
		return n;
	}
	public void levelTraverse() {
		Queue<Node> q=new LinkedList<>();
		if(root!=null)q.add(root);
		while(!q.isEmpty()) {
			Node n=q.poll();
			System.out.print(n.key+" ");
			if(n.left!=null)q.add(n.left);
			if(n.right!=null)q.add(n.right);
		}
		
	}
	}


