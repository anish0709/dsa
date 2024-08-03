package com.dsa;


public class CLL {

	Node head;
	Node tail;
	
	public CLL() {
		head = null;
		tail=null;
	}
	
	public void insert(int value) {
		Node node = new Node(value);
		if(head == null) {
			head = node;
			tail = node;
			return;
		}
		
		tail.next = node;
		node.next = head;
		tail = node;
	}
	
	public void display() {
		Node node = head;
		if(head == null) {
			System.out.println("END");
		}
		do {
			System.out.print(node.value+"->");
			node = node.next;
		}while(node!=head);
		System.out.println("END");
	}
	
	public void delete(int value) {
		Node node = head;
		if(head==null) {
			return;
		}
		if(head.value == value) {
			head = head.next;
			tail.next = head;
		}
		do {
			Node n = node.next;
			if(n.value == value) {
				node.next = n.next;
				break;
			}
			node= node.next;
		}while(node!=head);
	}
	
	
	private class Node{
		int value;
		Node next;
		
		public Node(int value) {
			this.value = value;
			
		}
		
		public Node(int value, Node next) {
			this.value = value;
			this.next= next;
		}
	}
}
