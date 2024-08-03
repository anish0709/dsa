package com.dsa;

public class DynamicStack extends Stack{
	
	public DynamicStack(int size) {
		super(size);
	}
	
	@Override
	public void push(int num) {
		if(isFull()) {
			super.size =size()*2;
			int temp[] = new int[size];
			for(int i=0;i<=super.top;i++) {
				temp[i]= super.arr[i];
			}
			super.arr = temp;
		}
		super.push(num);
	}

}
