package com.linkedlist;

import java.util.Scanner;

public class LinkedList {
	public static void main(String[] args) {
		LinkedListOperation operation = new LinkedListOperation();

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
				operation.addNodeInMiddle(mySecondNode);
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
				operation.displayNode();
				flag = true;
				break;
			case 7:
				operation.searchElement();
				flag = true;
				break;
			case 8:
				flag = false;
				break;
			}
		}
	}

	public static int inputMenu() {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter options to perform operations in Linked List");
		System.out.println("Press 1 to Add Node in the Beginning");
		System.out.println("Press 2 to Add Node at the End");
		System.out.println("Press 3 to Add Node in the Middle");
		System.out.println("Press 4 to Delete Node from the Beginning");
		System.out.println("Press 5 to Delete Node from the End");
		System.out.println("Press 6 to Display the Linked List");
		System.out.println("Press 7 to Search Node in the Linked List");
		System.out.println("Press 8 to Quit");

		int value = input.nextInt();

		return value;
	}
}
