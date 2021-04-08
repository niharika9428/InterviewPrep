package com.tree;

import java.util.LinkedList;
import java.util.Queue;

public class MaximumSumLevel {

	public static void main(String[] args) {

		BinaryTree bt = new BinaryTree();
		Node root = new Node(1);
		root.left = new Node(7);
		root.right = new Node(0);
		root.left.left = new Node(7);
		root.left.right = new Node(-8);
		System.out.println(bt.leafCount(root));
		System.out.println(bt.height(root));
		System.out.println(maxSumLevel(root));
	}

	// 0(n) can be used to find sum and level
	public static int maxSumLevel(Node root) {
		if (root == null)
			return 0;
		if (root.left == null && root.right == null) {
			return root.data;
		}
		int max = 0, level = 0, sum = 0, maxLevel = 0;
		Queue q = new LinkedList<>();
		q.add(root);
		while (!q.isEmpty()) {
			int size = q.size();
			sum = 0;
			level++;
			while (size > 0) {
				Node temp = (Node) q.poll();
				sum += temp.data;
				if (temp.left != null)
					q.add(temp.left);
				if (temp.right != null)
					q.add(temp.right);
				size--;
			}

			if (max < sum) {
				max = sum;
				maxLevel = level;
			}

		}
		//or you can return the max sum
		return maxLevel;
	}
	
	
//	public static int sumOfLeafNodes(Node root) {
//		
//	}
}
