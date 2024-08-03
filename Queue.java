package com.dsa;



public class Queue {

	private static final int DEFAULT_SIZE =10;
	private int end = 0;
	private int arr[];
	private int size;
	
	public Queue() {
		this(DEFAULT_SIZE);
	}
	
	public Queue(int size) {
		arr = new int[size];
		this.size = size;
	}
	
	public void offer(int num) {
		if(isFull()) {
			System.out.println("Queue is full");
			System.exit(1);
		}
		
		arr[end++] = num;
	}
	
	public int poll() {
		int element;
		if(isEmpty()) {
			System.out.println("Queue is empty");
			System.exit(1);
		}
		
		element = arr[0];
		for(int i=1;i<end;i++) {
			arr[i-1]=arr[i];
		}
		end--;	
		return element;
	}
	
	public int peek() {
		if(isEmpty()) {
			System.out.println("Queue is empty");
			System.exit(1);
		}
		return arr[0];
	}
	
	public boolean isFull() {
		if(arr.length == end) {
			return true;
		}
		return false;
	}
	
	public boolean isEmpty() {
		if(end == 0) {
			return true;
		}
		return false;
	}
	
	@Override
	public String toString() {
		String queue="";
		if(!isEmpty()) {
			for (int i = 0; i <end; i++) {
				queue += arr[i]+"->";
			}
		}
		return queue+"END";
	}
	
}


  