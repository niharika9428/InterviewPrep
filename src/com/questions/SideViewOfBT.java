package com.questions;

import java.util.LinkedList;
import java.util.Queue;

public class SideViewOfBT {

	
	
	public static void levelOrderTraversal(TreeNode root) {
		
		if(root == null) return;
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		q.add(root);
		
		while(!q.isEmpty()) {
			TreeNode temp = q.poll();
			System.out.print(temp.val+" ");
			if(temp.left != null) q.add(temp.left);
			if(temp.right != null) q.add(temp.right);
		}
		
		System.out.println(" ");
	
	}
	
	
  public static void leftSideView(TreeNode root) {
		
		if(root == null) return;
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		q.add(root);
		int level=0,size=0;
		boolean visited;
		while(!q.isEmpty()) {
			size = q.size();
			level++;
			visited = false;
			while(size>0) {
                TreeNode temp = q.poll();
                if(!visited) {
                	System.out.print(temp.val+" ");
    				visited=true;
                }
				if(temp.left != null) q.add(temp.left);
				if(temp.right != null) q.add(temp.right);
				size--;
			}
			
		}
	
	}  
  
  
  public static void rightSideView(TreeNode root) {
		
		if(root == null) return;
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		q.add(root);
		int level=0,size=0;
		boolean visited;
		while(!q.isEmpty()) {
			size = q.size();
			level++;
			visited = false;
			while(size>0) {
              TreeNode temp = q.poll();
              int last = size-1;
              if(!visited && last==0) {
              	System.out.print(temp.val+" ");
  				visited=true;
              }
				if(temp.left != null) q.add(temp.left);
				if(temp.right != null) q.add(temp.right);
				size--;
			}
			
		}
	
	}  
	
	
	public static void main(String[] args) {
		
		 TreeNode root = new TreeNode(4);
		 root.left = new TreeNode(5);
		 root.right = new TreeNode(6);
		 root.left.left= new TreeNode(1);
		 root.left.right= new TreeNode(2);
		 root.left.right.right = new TreeNode(8);
		 root.right.left= new TreeNode(3);
		 root.right.left.left=new TreeNode(9);
		 root.right.right= new TreeNode(7);
		 levelOrderTraversal(root);
		 leftSideView(root);
		 System.out.println(" ");
		 rightSideView(root);
		
	}
}
