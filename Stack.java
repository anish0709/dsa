package com.dsa;

public class Stack {
	
	private static final int DEFAULT_SIZE =10;
	protected int arr[];
	protected int top = -1;
	protected int size;
	
	public Stack() {
		this(DEFAULT_SIZE);
	}
	
	public Stack(int size) {
		arr = new int[size];
		this.size = size;
	}
	
	public boolean isFull() {
		if(size-1 == top) {
			return true;
		}
		return false;
	}
	
	public boolean isEmpty() {
		if(top== -1) {
			return true;
		}
		return false;
	}

	public void push(int num) {
		if(isFull()) {
			System.out.println("Stack is overflow");
			System.exit(1);
		}
		arr[++top] = num;
	}
	
	public int size() {
		return size;
	}
	
	public int pop() {
		if(isEmpty()) {
			System.out.println("Stack is empty");
			System.exit(1);
		}
		return arr[top--];
	}
	
	public int peek() {
		if(isEmpty()) {
			System.out.println("Stack is empty");
			System.exit(1);
		}
		return arr[top];
	}
	
	@Override
	public String toString() {
		String stack = "";
		for(int i=0;i<=top;i++ ) {
			if(i==top) {
				stack += " "+arr[i]+" ";
			}else {
				stack += " "+arr[i]+",";
			}
			
		}
		return "["+stack+"]";
	}
}
