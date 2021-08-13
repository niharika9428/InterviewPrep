package com.linkedList;

public class MergeLinkedList {
	
	public static Node mergeList(Node head1, Node head2) {
		
		if(null == head1 && null == head2) return null;
		if(null == head1 && null != head2) return head2;
		if(null != head1 && null == head2) return head1;
		
		
		Node dummy = new Node(-1);
		Node temp=dummy;
		while(true) {
			
			if(head1 == null) {
				temp.next = head2;
				break;
			}
			
			if(head2 == null) {
				temp.next = head1;
				break;
			}
			
			if(head1.data <= head2.data) {
				temp.next = head1;
				head1 = head1.next;
			}else {
				temp.next = head2;
				head2 = head2.next;
			}
			temp = temp.next;
	}
		return dummy.next;
	}
	
  public static void main(String[] args) {
		
		LinkedList l1 = new LinkedList(new Node(5));
		l1.insertNode(7);
		l1.insert(9);
		LinkedList l2 = new LinkedList(new Node(3));
		l2.insert(4);
		l2.insertNode(8);
		l2.insertNode(10);
		l1.printList(l1.head);
		l2.printList(l2.head);
		Node mergedHead = mergeList(l1.head,l2.head);
		l1.printList(mergedHead);
	}

}
