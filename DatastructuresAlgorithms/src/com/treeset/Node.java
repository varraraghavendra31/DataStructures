package com.treeset;

public class Node {
	int key;
	Node left, right;

	Node(int k) {
		key = k;
	}

	Node(int k, Node l, Node r) {
		key = k;
		left = l;
		right = r;
	}
}
