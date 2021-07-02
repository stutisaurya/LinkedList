package com.linkedlist;

public class LinkedList {
	public static void main(String[] args) {
		LinkedListOperation operation = new LinkedListOperation();

		Node<Integer> myFirstNode = new Node<>(56);
		Node<Integer> mySecondNode = new Node<>(30);
		Node<Integer> myThirdNode = new Node<>(70);

		operation.addNodeInBeginnig(myFirstNode);
		operation.addNodeAtEnd(myThirdNode);
		operation.addNodeInMiddle(mySecondNode);

		operation.displayNode();
		operation.deleteNodeFromBeginning();
		operation.displayNode();

	}
}
