package com.dsa;

public class BinarySearch {
	
	public static void main(String[] args) {
		int arr[] = {1,8,10,23,34,78,99};
		System.out.println(binarySearch(arr, 10));
	}
	
	public static int binarySearch(int arr[],int target) {
		int start =0;
		int end = arr.length-1;
		int j=0;
		while(start<=end) {
			System.out.println(++j);
			int mid = start + (end-start)/2;
			if(arr[mid]>target) {
				end = mid-1;
			}else if(arr[mid]<target) {
				start= mid+1;
			}else {
				return mid;
			}
			
			
		}
		
		return -1;
	}
}
