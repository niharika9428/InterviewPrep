package com.linkedList;

public class PairWiseSWap {

//	public static void main(String[] args) {
//		LinkedList l3 = new LinkedList(new Node(1));
//		l3.insert(2);l3.insert(3);l3.insert(4);l3.insert(5);
//		printList("Before swap ",l3.head);
//		rearrange(l3.head);
//		printList("After swap ",l3.head);
//	}
	
	public static void main(String[] args)
    {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
 
        Node head = null;
        for (int i = arr.length - 1; i >= 0; i--) {
            head = new Node(arr[i], head);
        }
 
        printList("Before : ", head);
        head = swap(head);
        printList("After : ", head);
    }

	public static Node swap(Node head) {
		if (null == head || null == head.next)
			return head;

		Node curr = head;
		Node prev = null;
		Node temp = null;
		while (curr != null && curr.next != null) {

			temp = curr.next;
			curr.next = temp.next;
			temp.next = curr;

			if (prev == null)
				head = temp;
			else
				prev.next = temp;

			prev = curr;
			curr = curr.next;
		}

		return head;
	}
	
	 public static void printList(String msg, Node head)
	    {
	        System.out.print(msg);
	 
	        Node ptr = head;
	        while (ptr != null)
	        {
	            System.out.print(ptr.data + " —> ");
	            ptr = ptr.next;
	        }
	 
	        System.out.println("null");
	    }

	 
	 public static Node rearrange(Node head)
	    {
	        // if the list is empty or contains just one node
	        if (head == null || head.next == null) {
	            return head;
	        }
	 
	        Node curr = head, prev = null;
	 
	        // consider two nodes at a time and swap their links
	        while (curr != null && curr.next != null)
	        {
	            Node temp = curr.next;
	            curr.next = temp.next;
	            temp.next = curr;
	 
	            if (prev == null) {
	                head = temp;
	            }
	            else {
	                prev.next = temp;
	            }
	 
	            prev = curr;
	            curr = curr.next;
	        }
	 
	        return head;
	    }
}

