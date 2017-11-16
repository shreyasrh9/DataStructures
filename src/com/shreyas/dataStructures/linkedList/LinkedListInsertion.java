package com.shreyas.dataStructures.linkedList;

public class LinkedListInsertion {
	Node head;

	public static void main(String[] args) {
		LinkedListInsertion insertion = new LinkedListInsertion();
		insertion.addNode(1);
		insertion.addNode(5);
		insertion.addNode(9);
		insertion.addNode(10);
		insertion.addNode(2);
		insertion.addNode(19);

		insertion.addAtFront(0);

		insertion.addAfter(10, 11);

		insertion.printNodes();
	}

	private void addAfter(int i, int j) {
		// TODO Auto-generated method stub
		Node temp = head;
		Node prev = null;

		while (temp.data != i) {
			temp = temp.next;
			prev = temp;

		}

		Node newNode = prev.next;
		prev.next = new Node(j);
		prev.next.next = newNode;

	}

	private void addAtFront(int i) {
		// TODO Auto-generated method stub
		Node temp = new Node(i);
		temp.next = head;
		head = temp;

	}

	private void printNodes() {
		// TODO Auto-generated method stub
		Node temp = head;

		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;

		}

	}

	private void addNode(int i) {
		// TODO Auto-generated method stub
		Node temp = head;
		if (head == null) {
			head = new Node(i);
		} else {
			while (temp.next != null) {
				temp = temp.next;
			}

			temp.next = new Node(i);

		}

	}

}
