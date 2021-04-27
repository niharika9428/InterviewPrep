package com.linkedList;

public class LinkedList {

	public int size;
	public Node tail;
	public Node head;

	public LinkedList(Node head) {
		this.size++;
		this.head = head;
	}

	public boolean isEmpty() {
		if (size != 0 && head != null)
			return false;
		return true;
	}

	public Node insert(int data) {
		if (isEmpty()) {
			head = new Node(data);
			tail = head;
		} else {
			Node curr = head;
			while (curr.getNext() != null) {
				curr = curr.getNext();
			}
			Node newNode = new Node(data);
			curr.setNext(newNode);
			tail = newNode;
		}
		size++;
		return head;
	}

	public Node insertNode(int data) {
		if (isEmpty()) {
			head = new Node(data);
			tail = head;
		} else {
			Node curr = head;
			while (curr.getNext() != null) {
				curr = curr.getNext();
			}
			Node newNode = new Node(data);
			curr.setNext(newNode);
			tail = newNode;
		}
		size++;
		return tail;
	}
	
	public Node insertAtEndWithTail(int data) {
		if (isEmpty()) {
			head = new Node(data);
			tail = head;
		} else {
			Node newNode = new Node(data);
			tail.setNext(newNode);
			tail = newNode;
		}
		size++;
		return head;
	}
	
	public Node insertAtEnd(int data) {
		if (isEmpty()) {
			head = new Node(data);
			tail = head;
		} else {
			Node newNode = new Node(data);
			tail.setNext(newNode);
			tail = newNode;
		}
		size++;
		return head;
	}
	
	public void printList(Node head) {
		if (null == head)
			System.out.println("List is empty");
		Node curr = head;
		while (curr != null) {
			System.out.print(curr.getData()+" ");
			curr = curr.getNext();
		}
		System.out.println("");
	}
	
	//delete traverse and then delete the node
	public void delete(int position) {
		if (null == head)
			System.out.println("List is empty");
		Node curr = head;
		int i = 1;
		while (curr != null) {
			if(i==position-1) {
				Node temp = curr.getNext();
				curr.setNext(temp.getNext());
				return;
			}
			i++;
			curr = curr.getNext();
		}
	}
	
//public ListNode middleNode(ListNode head) {
//        
//        if(head == null) return null;
//        
//        ListNode slow=head;
//        ListNode fast=head;
//        
//        while(fast != null && fast.next != null){
//            slow = slow.next;
//            fast = fast.next.next;
//        }
//        
//        return slow;
//    }
	
	public int convertToDecimal(Node head) {
		
		Node curr = head;
		int number=0;
		int power=size-1;
		while(curr != null) {
			number = (int) (number + (curr.getData() * (Math.pow(2, power))));
			System.out.println("----data---"+curr.getData()+"----power----"+power+"------number--------"+number);
			curr = curr.getNext();
			power--;
		}
		return number;
	}

	public static void main(String[] args) {

//		LinkedList ll = new LinkedList(new Node(1));
//		ll.printList(ll.head);
//		System.out.println("size : " + ll.size);
//		System.out.println(ll.isEmpty());
//		ll.insert(5);
//		ll.insert(10);
//		ll.printList(ll.head);
//		
//		System.out.println("head "+ ll.head.getData());
//		System.out.println("tail "+ ll.tail.getData());
//		
//		ll.insert(15);
//		System.out.println("head "+ ll.head.getData());
//		System.out.println("tail "+ ll.tail.getData());
//		System.out.println("size : " + ll.size);
//		ll.printList(ll.head);
//		
//		ll.delete(2);
//		ll.printList(ll.head);
//		LinkedList l2 = new LinkedList(new Node(1));
//		l2.insert(0);l2.insert(0);l2.insert(1);
//		l2.insert(0);l2.insert(0);l2.insert(1);l2.insert(1);l2.insert(1);
//		l2.insert(0);l2.insert(0);l2.insert(0);l2.insert(0);l2.insert(0);l2.insert(0);
//		l2.printList(l2.head);
//		
//		System.out.println("l2 size : "+l2.size);
//		System.out.println("convertToDecimal : "+l2.convertToDecimal(l2.head));
		
		LinkedList l3 = new LinkedList(new Node(1));
		l3.insert(1);l3.insert(1);l3.insert(1);
		l3.insert(2);l3.insert(3);l3.insert(4);l3.insert(4);l3.insert(5);
		l3.printList(l3.head);
		
		System.out.println("l3 size : "+l3.size);
		l3.removeDuplicates(l3.head);
		System.out.println("Removed duplicates");
		l3.printList(l3.head);
	}

	private void removeDuplicates(Node head2) {
		Node curr = head2;
		Node temp = head2;
		while(curr != null) {
			while(temp.getNext() != null && curr.getData() == temp.getNext().getData()) {
				temp = temp.getNext();
			}
			curr.setNext(temp.getNext());
			curr = curr.getNext();
		}
	}
}
