package com.tree;

public class DiameterOfBinaryTree {

	public static void main(String[] args) {

		BinaryTree bt = new BinaryTree();
		Node root = new Node(4);
		root.left = new Node(5);
		root.right = new Node(6);
		root.left.left = new Node(1);
		root.left.right = new Node(2);
		root.right.left = new Node(3);
		root.right.right = new Node(7);
		System.out.println(bt.leafCount(root));
		System.out.println(bt.height(root));

		System.out.println("Diameter is "+diameter(bt, root));
	}
//O(N*N) 
//This can be optimized if we calculate height in the same recursion O(N)
	private static int diameter(BinaryTree bt, Node root) {
		if (root == null)
			return 0;
		int lheight = bt.height(root.left);
		int rheight = bt.height(root.right);
		int ldiameter = diameter(bt, root.left);
		int rdiameter = diameter(bt, root.right);
		return Math.max((lheight + rheight), Math.max(ldiameter, rdiameter));
	}

}
