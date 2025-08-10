package com.sapient.dsa;

public class SampleTree {
	
	public static void main(String[] args) {
		PreOrderDFSTree preOrderDfs = new PreOrderDFSTree();
		
		Node root = new Node(45);
		root.left = new Node(37);
		root.right = new Node(24);
		root.left.left = new Node(17);
		root.left.right = new Node(33);
		root.right.right = new Node(89);
		root.right.left = new Node(48);
		
		System.out.println(preOrderDfs.traversePreOrder(root));
	}

}
