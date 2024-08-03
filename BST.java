package com.dsa;

public class BST {
	Node root;

	private class Node{
		int value;
		Node right;
		Node left;
		
		public Node(int value) {
			this.value = value;
		}
	}
	
	public boolean isEmpty() {
		return root==null;
	}
	
	public void insert(int value) {
		root = insert(value,root);
	}
	
	private Node insert(int value, Node node) {
		if(node==null) {
			node = new Node(value);
			return node;
		}
		if(value<node.value) {
			node.left = insert(value,node.left);
		}
		
		if(value>node.value) {
			node.right = insert(value,node.right);
		}
		
		return node;
	}
	
//	         4
//	       2   6
// 	      1 3 5 7
	
	public void delete(int value) {
		root = delete (value,root);
	}
	
	private Node delete(int value,Node node) {
		if(node ==null) {
			return node;
		}
		if(value<node.value) {
			node.left = delete(value,node.left);
		}else if(value>node.value) {
			node.right = delete(value,node.right);
		}else {
			if(node.left==null) return node.right;
			if(node.right==null) return node.left;
			
			node.value = minValue(node.right);
			node.right = delete(node.value,node.right);
		}
		return node;
	}
	
	private int minValue(Node node) {
		int minValue = node.value;
		while(node.left!=null) {
			minValue = node.left.value;
			node = node.left;
		}
		return minValue;
	}
	
	public void display() {
		if(isEmpty()) return ;
		display("Root value: ",root);
	}
	
	private void display(String detail, Node node) {
		if(node==null) {
			return;
		}
		System.out.println(detail+node.value);
		display("Left node of "+node.value+" : ",node.left);
		display("Right node of "+node.value+" : ",node.right);
	}
	
	public void populate(int nums[]) {
		for(int i:nums) {
			insert(i);
		}
	}
	
	public void populateSorted(int nums[]) {
		populateSortedElement(nums,0,nums.length);
	}
	private void populateSortedElement(int[] nums, int start, int end) {
		if(start>=end) {
			return;
		}
		
		int mid= (start+end)/2;
		insert(nums[mid]);
		
		populateSortedElement(nums, start, mid);
		populateSortedElement(nums,mid+1, end);
	}
	
	
	public void preOrder() {
		if(isEmpty()) return ;
		preOrder(root);
	}
	
	private void preOrder(Node node) {
		if(node==null) {
			return;
		}
		System.out.println(node.value);
		preOrder(node.left);
		preOrder(node.right);
	}
	
	public void inOrder() {
		if(isEmpty()) return ;
		inOrder(root);
	}
	
	private void inOrder(Node node) {
		if(node==null) {
			return;
		}
		inOrder(node.left);
		System.out.println(node.value);
		inOrder(node.right);
	}
	
	public void postOrder() {
		if(isEmpty()) return ;
		postOrder(root);
	}
	
	private void postOrder(Node node) {
		if(node==null) {
			return;
		}
		postOrder(node.left);
		postOrder(node.right);
		System.out.println(node.value);
	}
	
	
}
