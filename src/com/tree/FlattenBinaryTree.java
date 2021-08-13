package com.tree;

public class FlattenBinaryTree {

	public static void flatten(Node node) {

		if (node == null)
			return;
		if (node.left == null && node.right == null)
			return;

		if (node.left != null) {

			flatten(node.left);

			Node tempNode = node.right;
			node.right = node.left;
			node.left = null;

			Node curr = node.right;
			while (curr.right != null) {
				curr = curr.right;
			}
			curr.right = tempNode;

		}
		flatten(node.right);

	}

	public static void preOrder(Node root) {
		if (root == null)
			return;
		System.out.print(root.data + " ");
		preOrder(root.left);
		preOrder(root.right);
	}

	public static void inOrder(Node root) {
		if (root == null)
			return;
		inOrder(root.left);
		System.out.print(root.data + " ");
		inOrder(root.right);
	}

	public static void main(String[] args) {

		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(5);
		root.left.left = new Node(3);
		root.left.right = new Node(4);
		root.right.right = new Node(6);

		System.out.println(" Pre order : ");
		preOrder(root);
		System.out.println(" ");
		System.out.println(" In order : ");
		inOrder(root);

		flatten(root);

		System.out.println("After Flattening ");
		System.out.println(" Pre order : ");
		preOrder(root);
		System.out.println(" ");
		System.out.println(" In order : ");
		inOrder(root);

	}
}
