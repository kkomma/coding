package abc.interview.llds;

import abc.interview.llds.LinkedListMeRemoveAlso.Node;

/*
 * Given only a pointer/reference to a node to be deleted in a singly linked list, how do you delete it?

A simple solution is to traverse the linked list until you find the node you want to delete. 
But this solution requires pointer to the head node which contradicts the problem statement.
Fast solution is to copy the data from the next node to the node to be deleted and delete the next node. Something like following.

    // Find next node using next pointer
    struct Node *temp  = node_ptr->next;

    // Copy data of next node to this node
    node_ptr->data  = temp->data;

    // Unlink next node
    node_ptr->next  = temp->next;

    // Delete next node
    free(temp);
 */

public class LinkedListNoHeadDelete
{
	Node head; // head of the list

	class Node
	{
		int data;
		Node next;
		Node(int d) {
			data = d; 
			next = null; 
		}
	}

	/* Given a reference to the head of a list and an int,
        inserts a new Node on the front of the list. */
	public void push(int new_data)
	{
		/* 1. alloc the Node and put the data */
		Node new_Node = new Node(new_data);

		/* 2. Make next of new Node as head */
		new_Node.next = head;

		/* 3. Move the head to point to new Node */
		head = new_Node;
	}

	/* This function prints contents of linked list 
        starting from the given Node */
	public  void printList()
	{
		Node tNode = head;
		while (tNode != null) {
			System.out.print(tNode.data+" ");
			tNode = tNode.next;
		}
	}

	Node retNodeByValue(int value){
		Node temp = head;		
		while(temp !=null){
			if(value == temp.data){
				return temp;
			}
			temp = temp.next;
		}
		return temp;
	}
	
	public  void deleteNode(Node Node_ptr)
	{
		Node temp = Node_ptr.next;
		Node_ptr.data = temp.data;
		Node_ptr.next = temp.next;
		temp = null;
		//head = Node_ptr;
	}

	public static void main(String[] args)
	{
		LinkedListNoHeadDelete llist = new LinkedListNoHeadDelete();

		/* Use push() to construct below list
        1->12->1->4->1  */
		llist.push(1);
		llist.push(4);
		llist.push(1);
		llist.push(12);
		llist.push(1);

		System.out.println("Before deleting");
		llist.printList();

		/* I m deleting the head itself.
        You can check for more cases */
		//llist.deleteNode(llist.head);
		
		llist.deleteNode(llist.retNodeByValue(1));
		System.out.println("\nAfter Deleting");
		llist.printList();
		
		llist.deleteNode(llist.retNodeByValue(12));
		System.out.println("\nAfter Deleting");
		llist.printList();
		
	}
}
// This code is contributed by Rajat Mishra
