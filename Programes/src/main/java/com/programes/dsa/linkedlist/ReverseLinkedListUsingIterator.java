package com.programes.dsa.linkedlist;

public class ReverseLinkedListUsingIterator {

	Node head = null;

	public void reverseIterate() {

		Node prevNode = head;
		Node curNode = head.next;

		while (curNode != null) {

			Node nextNode = curNode.next;

			nextNode.next = prevNode;

			prevNode = curNode;
			curNode = nextNode;

		}

	}

	public static void main(String[] args) {

		ReverseLinkedListUsingIterator op = new ReverseLinkedListUsingIterator();

		op.insertRandomElementsInNode();
		op.printNode();
		op.reverseIterate();
		System.out.println();
		op.printNode();

	}

	private void printNode() {

		Node tmpnode = head;
		while (tmpnode != null) {

			System.out.print(tmpnode.data + " -> ");
			tmpnode = tmpnode.next;

		}

	}

	private void insertRandomElementsInNode() {
		int count = 0;
		while (count < 5) {
			Node tmpNode = new Node(count);
			tmpNode.next = head;
			head = tmpNode;
			count++;
		}

	}

}
