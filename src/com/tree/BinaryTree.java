package com.tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BinaryTree {

	Node root;
	
	
	public void indorderTraversal(Node root) {
		if(root==null) return;
		
		indorderTraversal(root.left);
		System.out.print(" "+root.data+" ");
		indorderTraversal(root.right);
		
	}
	
	public void preorderTraversal(Node root) {
		if(root==null) return;
		
        System.out.print(" "+root.data+" ");
		preorderTraversal(root.left);
		preorderTraversal(root.right);
		
	}
	
	public void postorderTraversal(Node root) {
		if(root==null) return;

		postorderTraversal(root.left);
		postorderTraversal(root.right);
		System.out.print(" "+root.data+" ");
		
	}
	
	// O(N) - space , TC -> O(N)
	public void iterative_preorder(Node root) {
		if(root==null) return;
		Stack st = new Stack();
		st.add(root);
		System.out.println(" ");
		while(!st.isEmpty()) {
			Node curr = (Node) st.pop();
			System.out.print(" "+curr.data+" ");
			if(curr.right != null) st.push(curr.right);
			if(curr.left != null) st.push(curr.left);
		}
		System.out.println(" ");
	}
	
	public void iterative_postorder(Node root) {
		if(root==null) return;
		Stack st = new Stack();
		Node curr = root;
		System.out.println(" ");
		while(true) {
			while(curr != null) {
				st.push(curr);
				st.push(curr);
				curr = curr.left;
			}
			if(st.isEmpty()) return;
			curr = (Node) st.pop();
			if(!st.isEmpty() && st.peek() == curr) {
				curr = curr.right;
			}else {
				System.out.print(" "+curr.data+" "); 
				curr= null;
			}
		}
	}
	//O(N)
	public void iterative_inorder(Node root) {
		if(root==null) return;
		Stack st = new Stack();
		Node curr = root;
		System.out.println(" ");
		while(curr != null || !st.isEmpty()) {
			// push all left child.
			while(curr != null) {
				st.push(curr);
				curr= curr.left;
			}
			
			curr = (Node) st.pop();
			System.out.print(" "+curr.data+" ");
			curr = curr.right;
		}
		System.out.println(" ");
	}
	
	public void levelOrderTraversal(Node root) {
		if(root==null) return;
		Queue st =  new LinkedList<>();
		st.add(root);
		System.out.println(" ");
		while(!st.isEmpty()) {
			Node curr = (Node) st.poll();
			System.out.print(" "+curr.data+" ");
			if(curr.left != null) st.add(curr.left);
			if(curr.right != null) st.add(curr.right);
		}
		System.out.println(" ");
	}
	
	public int leafCount(Node root) {
		if(root == null) return 0;
		else if(root.left == null && root.right == null) return 1;
		else return leafCount(root.left)+leafCount(root.right);
	}
	//O(logn)
	public int height(Node root) {
		//height or deapth of root is 0
		if(root == null) return 0;
		return Math.max(height(root.left),height(root.right))+1;
	}
	public static void main(String[] args) {
		 BinaryTree bt = new BinaryTree();
		 Node root = new Node(4);
		 root.left = new Node(5);
		 root.right = new Node(6);
		 root.left.left= new Node(1);
		 root.left.right= new Node(2);
		 root.right.left= new Node(3);
		 root.right.right= new Node(7);
		 System.out.println(bt.leafCount(root));
		 
		 System.out.println("===============INORDER==========================");
		 bt.indorderTraversal(root);
		 System.out.println(" ");
		 System.out.println("===============PREORDER==========================");
		 bt.preorderTraversal(root);
		 System.out.println(" ");
		 System.out.println("===============POSTORDER==========================");
		 bt.postorderTraversal(root);
		 
		 System.out.println(" ");
		 System.out.println("***************************-----------Iterative------------**************************************");
		 System.out.println("===============PREORDER==========================");
		 bt.iterative_preorder(root);
		 System.out.println("===============INORDER==========================");
		 bt.iterative_inorder(root);
		 System.out.println("===============POSTORDER==========================");
		 bt.iterative_postorder(root);
		 System.out.println(" ");
		 System.out.println("***************************-----------Level Order------------**************************************");
		 bt.levelOrderTraversal(root);
		 System.out.println(bt.height(root));
	}
	
	
	
}

