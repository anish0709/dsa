package com.dsa;

public class LinkedList {

	private Node head;
	private Node tail;
	private int size;
	
	public LinkedList() {
		this.size=0;
	}
	
	
	public void insertFirst(int value) {
		Node node = new Node(value);
		node.next = head;
		head = node;
		if(tail ==null) {
			tail = head;
		}
		size+=1;
	}
	
	public void insertLast(int value) {
		if(tail==null) {
			insertFirst(value);
			return;
		}
		
		Node node = new Node(value);
		tail.next = node;
		tail= node;
		size+=1;
	}
	
	public void insert(int value,int index) {
		if(index==0) {
			insertFirst(value);
			return;
		}
		if(index==size) {
			insertLast(value);
			return;
		}
		
		Node temp = head;
		for(int i=1;i<index;i++) {
			temp = temp.next;
		}
		
		Node node = new Node(value,temp.next);
		temp.next = node;
		size+=1;
	}
	
	public int deleteFirst() {
		int value = head.value;
		head = head.next;
		if(head==null) {
			tail=null;
		}
		size-=1;
		return value;
	}
	
//	h           t
//	1->2->3->4->5                 h null
//	         n  
	
	public int deleteLast() {
		Node node = getNode(size-2);
		int value = tail.value;
		tail = node;
		tail.next = null;
		size-=1;
		return value;
	}
	
	public int delete(int index) {
		if(index==0) {
			deleteFirst();
		}
		if(index==size-1) {
			deleteLast();
		}
		Node node = getNode(index-1);
		int value = node.next.value;
		node.next = node.next.next;
		size-=1;
		return value;
	}
	
	public Node getNode(int index) {
		Node temp = head;
		for(int i=0;i<index;i++) {
			temp = temp.next;
		}
		return temp;
	}
	
	public void display() {
		Node temp = head;
		while(temp!=null) {
			System.out.print(temp.value+"->");
			temp = temp.next;
		}
		System.out.println("END");
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
