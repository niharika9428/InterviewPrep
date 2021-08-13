package com.linkedList;

public class QuestionsLinkedList {

	public static Node insert(Node head, int data) {

		if (null == head) {
			return new Node(data);
		}

		Node curr = head;
		while (null != curr.next) {
			curr = curr.next;
		}
		curr.next = new Node(data);
		return head;
	}

	public static void printList(Node head) {

		if (null == head) {
			System.out.println("List is Empty");
		}
		Node curr = head;
		while (null != curr) {
			System.out.print(curr.data + " ");
			curr = curr.next;
		}
	}

	public static Node reverse(Node head) {
		if (null == head) {
			System.out.println("List is empty . Cannot be reversed.");
		}
		Node curr = head;
		Node prev = null, next = null;
		while (null != curr) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		return prev;
	}

	public static int middleElement(Node head) {
		int middle = -1;
		if (head == null) {
			System.out.println("List is empty");
			return -1;
		}

		Node slow = head, fast = head;
		while (fast != null && fast.next != null) {
			// System.out.println("Slow "+slow.data);
			// System.out.println("Fast "+fast.data);
			slow = slow.next;
			fast = fast.next.next;
		}
		middle = slow.data;
		return middle;
	}

	private static Node rotate(Node head, int k) {
		if (head == null || head.next == null || k == 0)
			return head;

		int len = 1;
		Node curr = head;
		while (curr.next != null) {
			curr = curr.next;
			len++;
		}

		System.out.println("\nLength is : " + len);
		curr.next = head;
		k = k % len;
		k = len - k;

		while (k-- > 0) {
			curr = curr.next;
		}

		head = curr.next;
		curr.next = null;

		return head;
	}

	public static void main(String[] args) {
		Node head = new Node(5);
		insert(head, 4);
		insert(head, 3);
		insert(head, 2);
		insert(head, 1);
		printList(head);
		System.out.println("\nAfter reverse");
		head = reverse(head);
		printList(head);
		System.out.println("\nMiddle element is :");
		System.out.println(middleElement(head));
		printList(head);
		head = rotate(head, 2);
		System.out.println("\nAfter rotation : \n");
		printList(head);

	}
}
