package com.tree;

import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {

	public static class TreeNode {

		int data;
		TreeNode left;
		TreeNode right;

		public TreeNode(int data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}

	}

	public static TreeNode insert(TreeNode root, int data) {
		if (root == null) {
			return new TreeNode(data);
		}
		if (data <= root.data) {
			root.left = insert(root.left, data);
		} else if (data > root.data) {
			root.right = insert(root.right, data);
		}
		return root;
	}

	public static void search(TreeNode node, int data, TreeNode parent) {
		if (node == null) {
			System.out.println("Key not found");
			return;
		}
		if (node.data == data) {
			if (parent == null) {
				System.out.println("Root is the key");
			} else if (data <= parent.data) {
				System.out.println("Key is on the left side of " + parent.data);
			} else {
				System.out.println("Key is on the right side of " + parent.data);
			}
			return;
		}

		if (node.data <= data) {
			search(node.right, data, node);
		} else {
			search(node.left, data, node);
		}

	}

	public static void inorder(TreeNode root) {
		if (root == null) {
			return;
		}
		inorder(root.left);
		System.out.print(root.data + " ");
		inorder(root.right);
	}

	public static void levelOrder(TreeNode root) {
		if (root == null) {
			return;
		}
		Queue<TreeNode> q = new LinkedList<>();
		q.add(root);
		while(!q.isEmpty()) {
			TreeNode node = q.poll();
			System.out.print(node.data+" ");
			if(null != node.left) q.add(node.left);
			if(null != node.right) q.add(node.right);
		}
	}
	
	public static void leftSideView(TreeNode root) {
		if (root == null) {
			return;
		}
		Queue<TreeNode> q = new LinkedList<>();
		q.add(root);
		int size =0;
		boolean visited;
		while(!q.isEmpty()) {
			size = q.size();
			visited = false;
			while(size >0) {
				TreeNode node = q.poll();
				if(!visited) {
					System.out.print(node.data+ " ");
					visited= true;
				}
				if(null != node.left) q.add(node.left);
				if(null != node.right) q.add(node.right);
				size --;
			}
		}
	}
	
	public static void rightSideView(TreeNode root) {
		if (root == null) {
			return;
		}
		Queue<TreeNode> q = new LinkedList<>();
		q.add(root);
		int size =0;
		boolean visited;
		int last =0;
		while(!q.isEmpty()) {
			size = q.size();
			last = size-1;
			visited = false;
			while(size >0) {
				TreeNode node = q.poll();
				if(!visited && last==0) {
					System.out.print(node.data+ " ");
					visited= true;
				}
				if(null != node.left) q.add(node.left);
				if(null != node.right) q.add(node.right);
				size --;
				last--;
			}
		}
	}
	
	public static void main(String[] args) {

		int keys[] = { 15, 10, 20, 8, 12, 16, 25 };
		TreeNode root = null;
		for (int i : keys) {
			root = insert(root, i);
		}
		inorder(root);
		System.out.println("");
		System.out.println("Level Order");
		levelOrder(root);
		System.out.println("Left side view");
		leftSideView(root);
		System.out.println("");
		System.out.println("Right side view");
		rightSideView(root);
		System.out.println("");
		search(root, 8, null);

	}

}
