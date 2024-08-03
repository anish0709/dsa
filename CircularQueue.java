package com.dsa;

public class CircularQueue {
	private static final int DEFAULT_SIZE =10;
	private int front =0;
	private int end = 0;
	private int arr[];
	private int size = 0;
	
	public CircularQueue() {
		this(DEFAULT_SIZE);
	}
	
	public CircularQueue(int size) {
		arr = new int[size];
	}
	
	public void offer(int num) {
		if(isFull()) {
			System.out.println("Queue is full");
			System.exit(1);
		}
		arr[end++] = num;
		end = end % arr.length;
		size++;
	}
	
	public int poll() {
		int element;
		if(isEmpty()) {
			System.out.println("Queue is empty");
			System.exit(1);
		}
		
		element = arr[front++];
		front = front % arr.length;
		size--;
		return element;
	}
	
	public int peek() {
		if(isEmpty()) {
			System.out.println("Queue is empty");
			System.exit(1);
		}
		return arr[front];
	}
	
	public boolean isFull() {
		if(arr.length == size) {
			return true;
		}
		return false;
	}
	
	public boolean isEmpty() {
		if(size == 0) {
			return true;
		}
		return false;
	}
	
	@Override
	public String toString() {
		String queue="";
		if(!isEmpty()) {
			int i = front; 
			do {
				queue += arr[i]+" -> ";
				i++;
			}while(i!=end);
		}
		return queue+"END";
	}
}


    









