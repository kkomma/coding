package abc.interview.adynamic;

import java.util.Stack;

public class LinkedListMeSamTes {

	Node head, tail;

	class Node{
		int value;
		Node next;
		Node(int value) {
			this.value = value;
			this.next = null;
		}
	}


	void push(int value) {
		Node temp  = new Node(value);
		if(head == null) {
			head = tail = temp;
		}		 
		tail.next = temp;
		tail = temp;
	}

	Stack<Integer> printNodes() {
		Stack<Integer> s = new Stack<>();
		Node temp = head;
		if(temp == null) {
			return s;
		}
		while(temp != null) {
			System.out.print(temp.value+" ");
			s.push(temp.value);
			temp = temp.next;
		}
		System.out.println();
		return s;
	}

	static Stack<Integer> sss = new Stack<>();

	static Stack<Integer> printReverse(Node head) {
		if(head == null) {
			return sss;
		}			
		printReverse(head.next);
		sss.push(head.value);
		System.out.print(head.value+" ");
		return sss;
	}

	public static void main(String[] args) {

		//int[] a = {3,22,1,55,5,123};
		int[] a = {3,22,1,22,3};
		
		LinkedListMeSamTes list = new LinkedListMeSamTes();
		for(int i=0; i < a.length;i++) {
			list.push(a[i]);	
		}
		
		Stack<Integer> s1 = list.printNodes();
		Stack<Integer> s2 = printReverse(list.head);
		
		System.out.println(s1.size());
		System.out.println(s2.size());
		if(s1.size() != s2.size()) {
            System.out.println("Not a palindrome");
		}
		boolean b = false;
		for(int i=0; i < s2.size(); i++) {
	           if(!s2.get(i).equals(s1.get(i))) {
	        	      System.out.println();
	                  System.out.println("Not a palindrome");
	                  b = true;
	                  break;
	           }
	    }
		if(b == false){
			System.out.println();
            System.out.println("Link list is a palindrome");
		}
	}

}
