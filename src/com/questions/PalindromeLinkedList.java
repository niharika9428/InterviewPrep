package com.questions;

import com.linkedList.LinkedList;
import com.linkedList.Node;

public class PalindromeLinkedList {
	
	public static void main(String[] args) {
		LinkedList l3 = new LinkedList(new Node(1));
		l3.insert(1);l3.insert(2);
		l3.insert(1);
		l3.printList(l3.head);
		
		System.out.println(isPallindrome(l3.head));
		//l3.printList(l3.head);
		System.out.println();
	}
	//Two pointers
	//reverse
	public static boolean isPallindrome(Node head) {
		
		if(head == null || head.next == null) return true;
		Node slow = head;
		Node fast = head;
		while(fast != null && fast.next != null) {
			slow = slow.next;
			fast=fast.next.next;
			System.out.println("at "+slow.data);
		}
		slow=reverse(slow);
		fast = head;
		while(slow != null) {
			if(slow.data != fast.data)
				return false;
			slow = slow.next;
			fast = fast.next;
		}
		return true;
	}
	
	public static Node reverse(Node head) {
		if(head ==  null ) return null;
 		Node curr = head;
		Node next = head.next;
		Node prev = null;
		while(curr != null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr=next;
		}
		head = prev;
		return head;
	}
}

