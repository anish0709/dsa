package com.dsa;

import java.util.Scanner;

public class BinaryTree {
	
	private Node root;
	
	private class Node{
		Node right;
		Node left;
		int value;
		
		public Node(int value) {
			this.value = value;
		}
	}
	
	public void populate(Scanner sc) {
		System.out.println("Enter root node value");
		int value = sc.nextInt();
		root = new Node(value);
		populate(sc,root);
	}
	
	private void populate(Scanner sc,Node node) {
		System.out.println("Do you want to enter left of "+node.value);
		boolean left = sc.nextBoolean();
		if(left) {
			System.out.println("Enter left node value of "+node.value);
			int value = sc.nextInt();
			node.left = new Node(value);
			populate(sc,node.left);
		}
		System.out.println("Do you want to enter right of "+node.value);
		boolean right = sc.nextBoolean();
		if(right) {
			System.out.println("Enter Right node value of "+node.value);
			int value = sc.nextInt();
			node.right = new Node(value);
			populate(sc,node.right);
		}
	}
	
	public void display() {
		display(root,"");
	}
	
	private void display(Node node,String indent) {
		if(node==null) {
			return;
		}
		System.out.println(indent+node.value);
		display(node.left,indent+"\t");
		display(node.right,indent+"\t");
	}
}
