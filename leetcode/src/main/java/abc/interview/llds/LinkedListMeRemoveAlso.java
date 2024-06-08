package abc.interview.llds;

import java.util.Stack;

/*
 
*******************see below for better understadning****************************
 http://www.geeksforgeeks.org/linked-list-set-1-introduction/
reverse the linked list and remove the linked list 
for sort and un sorted order

hashmap questions adigadu
remove from unsorted linked list

time complexity
inka sorting best time complexity

inka hashmap  and has table gurunci
hashmap get() and put() time complexity 

http://collabedit.com/h2xwe
https://www.cs.cmu.edu/~adamchik/15-121/lectures/Linked%20Lists/linked%20lists.html

*/

public class LinkedListMeRemoveAlso {
	
	Node head;
	Node tail;

	class Node{
		Node next;
		int value;
		Node(int value){
			this.value = value;
			this.next = null;
		}
	}
	void addNode(int value){
		Node temp = new Node(value);		
		if(head == null){
			head = tail = temp;
			return;
		}		
		tail.next=temp;
		tail=temp;
	}

	/* This function is in LinkedList class.
	   Inserts a new node after the given prev_node. This method is 
	   defined inside LinkedList class shown above */
	public void insertAfter(Node prev_node, int new_data)
	{
		/* 1. Check if the given Node is null */
		if (prev_node == null)
		{
			System.out.println("The given previous node cannot be null");
			return;
		}

		/* 2. Allocate the Node &
	       3. Put in the data*/
		Node new_node = new Node(new_data);

		/* 4. Make next of new Node as next of prev_node */
		new_node.next = prev_node.next;

		/* 5. make next of prev_node as new_node */
		prev_node.next = new_node;
	}

	/* Appends a new node at the end.  This method is 
	   defined inside LinkedList class shown above */
	public void append(int new_data)
	{
		/* 1. Allocate the Node &
	       2. Put in the data
	       3. Set next as null */
		Node new_node = new Node(new_data);

		/* 4. If the Linked List is empty, then make the
	           new node as head */
		if (head == null)
		{
			head = new Node(new_data);
			return;
		}

		/* 4. This new node is going to be the last node, so
	         make next of it as null */
		new_node.next = null;

		/* 5. Else traverse till the last node */
		Node last = head; 
		while (last.next != null)
			last = last.next;

		/* 6. Change the next of last node */
		last.next = new_node;
		return;
	}
	/* This function is in LinkedList class. Inserts a
	   new Node at front of the list. This method is 
	   defined inside LinkedList class shown above */
	public void push(int new_data)
	{
		/* 1 & 2: Allocate the Node &
	              Put in the data*/
		Node new_node = new Node(new_data);

		/* 3. Make next of new Node as head */
		new_node.next = head;

		/* 4. Move the head to point to new Node */
		head = new_node;
	}



    /* Function to print reverse of linked list */
    void printReverse(Node head)
    {
        if (head == null){
        	return;
        }
        // print list of head node
        printReverse(head.next);
 
        // After everything else is printed
        System.out.print(head.value+" ");
    }
    
    
	boolean hasCycle() {
		Node fast = head;
		while(fast != null && fast.next != null) {
			fast = fast.next.next;
			head = head.next;
			if(head.equals(fast)) {
				return true;
			}
		}
		return false;
	}
	
	public void deleteNode(Node node) {
		node.value = node.next.value;
		node.next = node.next.next;
	}
	void printNodes(){
		Node temp = head;
		while(temp !=null){			
			System.out.println(temp.value);
			temp = temp.next;
		}
	}
	Stack<Integer> getNodeValues(){
		Stack<Integer> stack = new Stack<Integer>();		
		System.out.println("=======getNodeValues========");
		Node temp = head;
		while(temp !=null){	
			int i = temp.value;
			stack.push(i);
			System.out.println(i);
			temp = temp.next;
		}
		return stack;
	}
	Node retNode(int position){
		Node temp = head;		
		int count = 0;
		while(temp !=null){
			count++;
			temp = temp.next;
			if(position == count){
				return temp;
			}
		}
		return temp;
	}
	
	Node retNodeByValue(int value){
		Node temp = head;		
		while(temp !=null){
			temp = temp.next;
			if(value == temp.value){
				return temp;
			}
		}
		return temp;
	}
	
	
	void isLinkedListPalim(){
		Stack<Integer> s = getNodeValues();
		Stack<Integer> s2 = new Stack<>();		
		while(!s.isEmpty()){
			s2.add(s.pop());
		}
		Stack<Integer> s1 = getNodeValues();
		boolean b = false;
		for(int i=0; i < s2.size(); i++) {
	           if(!s2.get(i).equals(s1.get(i))) {
	                  System.out.println("Not a palindrome");
	                  b = true;
	                  break;
	           }
	    }
		if(b == false){
            System.out.println("Link list is a palindrome");
		}
	}
	
	public static void main(String[] args) {
		LinkedListMeRemoveAlso h = new LinkedListMeRemoveAlso();		
		h.addNode(10);
		h.addNode(12);
		h.addNode(14);
		h.addNode(16);
		//h.addNode(17);
		//h.addNode(18);
		h.addNode(14);
		h.addNode(12);
		h.addNode(10);

		h.printNodes();
		System.out.println("==============");

		h.isLinkedListPalim();

		System.out.println("======print reverse========");
		h.printReverse(h.head);
		System.out.println();
		
		System.out.println("===============================");
		h.push(33);
		h.printNodes();
		System.out.println("======pushed at begining above========");

		h.append(66);
		h.printNodes();
		System.out.println("======pushed at end above========");

		h.insertAfter(h.retNode(4),5);
		h.printNodes();
		System.out.println("======inserted after 4th above========");

		h.deleteNode(h.retNode(2));		
		h.printNodes();
		System.out.println("node has cycle::"+h.hasCycle());
		
		System.out.println("======node 66 below========");
		Node nn = h.retNodeByValue(12);
		System.out.println("66 value:"+nn.value);
		h.printNodes();
	}
}
