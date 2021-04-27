package com.linkedList;

public class DetectLoop {

	
	public static boolean detectLoop(Node head) {
		
		Node slow = head;
		Node fast = head.next;
		
		while(slow != fast) {
			if(fast == null || fast.next == null) {
				return false;
			}
			slow = slow.next;
			fast = fast.next.next;
		}
		return true;	
	}
	
	public static void main(String[] args) {
		
		LinkedList l3 = new LinkedList(new Node(1));
		Node second = l3.insertNode(2);
		l3.insert(3);
		l3.insert(4);
		Node curr = l3.insertNode(5);
		curr.next=second;
		//l3.printList(l3.head);
		
		System.out.println(detectLoop(l3.head));
		
	}
}
