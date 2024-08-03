package com.dsa;

import java.util.Arrays;

public class SelectionSort {
	public static void main(String[] args) {
		int arr[] = {3,9,1,5,11,7};
		selectionSort(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	
	public static void selectionSort(int arr[]) {
		
		for(int i=0;i<arr.length;i++) {
			
			int lastIndex = arr.length-i-1;
			int maxIndex = maxElementIndex(arr,0,lastIndex);
			swapMaxElement(arr,maxIndex,lastIndex);
			
		}
	}
	
	public static void swapMaxElement(int arr[],int max, int last) {
		int temp = arr[max];
		arr[max]=arr[last];
		arr[last] = temp;
	}
	
	public static int maxElementIndex(int arr[],int start,int end) {
		int max = start;
		for(int i=0;i<end;i++) {
			if(arr[max]<arr[i]) {
				max = i;
			}
		}
		return max;
	}
}
