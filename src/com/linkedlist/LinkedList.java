package com.linkedlist;

/**
 * Ability to delete 40 from the Linked List sequence of 56->30->40->70 and show the size of LinkedList is 3
 * Search LinkedList to get Node with key value 40
 * Delete the node
 * Implement size() and show the Linked List size is 3
 * Final Sequence: 56->30->70
 */

import java.util.Scanner;

public class LinkedList {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		LinkedListOperation operation = new LinkedListOperation();
		INode headNode = null;

		Node<Integer> myFirstNode = new Node<>(56);
		Node<Integer> mySecondNode = new Node<>(30);
		Node<Integer> myThirdNode = new Node<>(70);

		boolean flag = true;
		while (flag) {
			int option = inputMenu();
			switch (option) {
			case 1:
				operation.addNodeInBeginnig(myFirstNode);
				flag = true;
				break;
			case 2:
				operation.addNodeAtEnd(myThirdNode);
				flag = true;
				break;
			case 3:
				System.out.println("Enter the data you want to add");
				Integer element = input.nextInt();
				System.out.println("Enter the position where you want to add the data ");
				int position = input.nextInt();
				operation.addNodeInPosition(element, position);
				flag = true;
				break;
			case 4:
				operation.deleteNodeFromBeginning();
				flag = true;
				break;
			case 5:
				operation.deleteNodeFromLast();
				flag = true;
				break;
			case 6:
				System.out.println("Enter the data you want to delete");
				Integer value = input.nextInt();
				operation.deleteNodeFromPosition(value);
				flag = true;
				break;
			case 7:
				operation.displayNode(headNode);
				flag = true;
				break;
			case 8:
				operation.searchElement();
				flag = true;
				break;
			case 9:
				flag = false;
				break;
			}
		}
	}

	public static int inputMenu() {

		System.out.println();
		System.out.println("Enter options to perform operations in Linked List");
		System.out.println("Press 1 to Add Node in the Beginning");
		System.out.println("Press 2 to Add Node at the End");
		System.out.println("Press 3 to Add Node in the Between the List");
		System.out.println("Press 4 to Delete Node from the Beginning");
		System.out.println("Press 5 to Delete Node from the End");
		System.out.println("Press 6 to Delete Node from the Middle");
		System.out.println("Press 7 to Display the Linked List");
		System.out.println("Press 8 to Search Node in the Linked List");
		System.out.println("Press 9 to Quit");

		int value = input.nextInt();

		return value;
	}
}
