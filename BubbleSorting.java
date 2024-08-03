package com.dsa;

import java.util.Arrays;

public class BubbleSorting {
	
	public static void main(String[] args) {
		int arr[] = {3,9,0,2,11};
		bubbleSort(arr);
		for(int i:arr) {
			System.out.println(i);
		}
	}
	
	public static void bubbleSort(int arr[]) {
		boolean swapped = false;
		for(int i=0;i<arr.length;i++) {
			swapped = false;
			for(int j=1;j<arr.length-i;j++) {
				if(arr[j-1]>arr[j]) {
					int temp = arr[j];
					arr[j]=arr[j-1];
					arr[j-1] = temp;
					swapped =true;
				}
				
			}
			if(!swapped) {
				break;
			}
		}
	}
}
