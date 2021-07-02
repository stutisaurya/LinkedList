package com.linkedlist;

public class LinkedListOperation {
	// Represent the head and tail of the singly linked list
	Node head;
	Node tail;
	int size;

	public void addNode(Node newNode) {
		if (head == null) {
			head = newNode;
			tail = newNode;
		} else {
			tail.next = newNode;
			tail = newNode;
		}
		size++;
	}

	public void addNodeInMiddle(Node newNode) {

		if (head == null) {
			head = newNode;
			tail = newNode;
		} else {
			INode temp, current;
			int count = (size % 2 == 0) ? (size / 2) : ((size + 1) / 2);
			temp = head;
			current = null;
			for (int i = 0; i < count; i++) {
				current = temp;
				temp = temp.getNext();
			}
			current.setNext(newNode);
			newNode.setNext(temp);
		}
		size++;
	}

	public void displayNode() {
		INode current = head;
		if (head == null)
			System.out.println("Linked List is empty");
		System.out.print("Nodes are: ");
		while (current != null) {
			if (current.getNext() != null) {
				System.out.print(current.getKey() + " -> ");
				current = current.getNext();
			} else {
				System.out.println(current.getKey());
				current = current.getNext();
			}
		}
	}
}
