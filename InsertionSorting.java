package com.dsa;

import java.util.Arrays;

public class InsertionSorting {
	public static void main(String[] args) {
		int arr[]= {4,2,5,1,9};
		insertionSort(arr );
		System.out.println(Arrays.toString(arr));
	}
	
	public static void insertionSort(int arr[]) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j>0;j--) {
				if(arr[j-1]<arr[j]) {
					swapElement(arr,j-1,j);
				}else {
					break;
				}
			}
		}
	}
	
	public static void swapElement(int arr[],int left,int right) {
		int temp = arr[left];
		arr[left] = arr[right];
		arr[right] = temp;
	}
}
