package com.programes.dsa.linkedlist;

public class LinkedListInsertOperations {

	Node head = null;

	public void inserAtBegining(int data) {

		Node newNode = new Node(data);

		if (head == null) {
			head = newNode;
			return;
		}

		newNode.next = head;
		head = newNode;

	}

	public void insertAtEnd(int data) {

		Node newNode = new Node(data);
		if (null == head) {
			head = newNode;
		}

		Node tmpNode = head;

		while (tmpNode.next != null) {

			tmpNode = tmpNode.next;
		}

		tmpNode.next = newNode;

	}

	public void insertAtPosition(int data, int pos) {

		// first position
		Node newNode = new Node(data);
		int count = 1;
		if (head == null) {
			head = newNode;
			return;
		}

		if (count == pos) {
			newNode.next = head.next;
			head = newNode;
		}

		// Last
		Node prevNode = head;
		Node tmpNode = prevNode.next;

		while (count <= pos && tmpNode != null) {

			if (count == pos) {
				prevNode.next = newNode;
				newNode.next = tmpNode;
				// return;
			}
			prevNode = tmpNode;
			tmpNode = tmpNode.next;
			count++;
		}

		if (count < pos && tmpNode == null) {
			System.err.println("Position is incorrect..!!!");
			return;
		}
	}

	public void printNode() {

		Node tmp = head;
		while (tmp != null) {
			System.out.print(tmp.data + "=> ");
			tmp = tmp.next;
		}
	}

	public void deleteAtBegin() {

		head = head.next;

	}

	public void deleteAtEnd() {

		Node prevNode = head;
		Node tmpNode = prevNode.next;

		while (tmpNode.next != null) {
			prevNode = tmpNode;
			tmpNode = tmpNode.next;
		}

		prevNode.next = null;
	}

	public static void main(String[] args) {

		LinkedListInsertOperations op = new LinkedListInsertOperations();
		op.inserAtBegining(12);
		op.inserAtBegining(11);
		op.inserAtBegining(10);

		op.insertAtEnd(13);
		op.insertAtEnd(14);

		op.insertAtPosition(30, 6);
		op.printNode();
		System.out.println();
		op.deleteAtBegin();

		op.printNode();
		System.out.println();
		op.deleteAtEnd();
		op.printNode();
	}

}
