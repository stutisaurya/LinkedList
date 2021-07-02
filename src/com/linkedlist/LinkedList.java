package com.linkedlist;

public class LinkedList {
	public static void main(String[] args) {
		LinkedListOperation operation = new LinkedListOperation();
		INode head;
		Node<Integer> myFirstNode = new Node<>(70);
		Node<Integer> mySecondNode = new Node<>(30);
		Node<Integer> myThirdNode = new Node<>(56);

		head = operation.addNode(myFirstNode);
		operation.displayNode(head);
		head = operation.addNode(mySecondNode);
		operation.displayNode(head);
		head = operation.addNode(myThirdNode);
		operation.displayNode(head);
	}
}
