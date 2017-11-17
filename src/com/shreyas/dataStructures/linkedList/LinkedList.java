package com.shreyas.dataStructures.linkedList;

public class LinkedList {
	Node head;

	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList();
		linkedList.addNode(1);
		linkedList.addNode(5);
		linkedList.addNode(9);
		linkedList.addNode(10);
		linkedList.addNode(2);
		linkedList.addNode(19);

		linkedList.addAtFront(0);

		linkedList.addAfter(10, 11);
		
		//linkedList.delete(10);
		
		linkedList.swap(5, 9);

		linkedList.printNodes();
	}

	private void swap(int i, int j) {
		// TODO Auto-generated method stub
		Node temp = head;
		Node prev = null;
		
		while(temp.data != i){
			prev = temp;
			temp = temp.next;
		}
		
		
		Node jTemp = head;
		Node next = null;
		
		
		while(jTemp.data != j){
			jTemp = jTemp.next;
			
			if(jTemp.next != null){
				next = jTemp.next;
			}else{
				next = null;
			}
		}
		
		prev.next = jTemp;
		temp.next = next;
		jTemp.next = temp;
		
	}

	private void delete(int i) {
		// TODO Auto-generated method stub
		Node temp = head;
		Node prev = null;
		
		while(temp.data != i){
			prev = temp;
			temp = temp.next;
		}
		
		prev.next = temp.next;
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
