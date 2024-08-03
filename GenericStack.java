package com.dsa;

import java.util.ArrayList;

public class GenericStack<T> {
	
	private ArrayList<T> arr;
	private int size;
	private int top = -1;
	
	public GenericStack() {
		arr = new ArrayList<T>();
	}
	
	public void push(T a) {
		arr.set(++top,a);
	}
	
	public T pop() {
		return arr.get(top--);
	}
	
	public T peek() {
		return arr.get(top);
	}

}
