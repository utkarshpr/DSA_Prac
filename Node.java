package com.Arrays;

public class Node {
	int data;
	Node left;
	Node right;

	Node() {
	}

	Node(int d) {
		this.data = d;
		this.left=null;
		this.right=null;
	}

	Node(Node l, Node r, int d) {
		this.data = d;
		this.left = l;
		this.right = r;
	}
}
