package com.dsa;

public class RecursionEx1 {
	public static void main(String[] args) {
//		print1(1);
		System.out.println(fib(50));
	}
	
	  
	
	public static int fib(int n) {
		if(n<2) {
			return n;
		}
		return fib(n-1)+fib(n-2);
	}
	                           
	                         
	                          
	
//	public static void print1(int n) {
//		if(n==11) {
//			return;
//		}
//		System.out.println(n);
//		print1(++n);
//		
//	}
	
	
//	public static void print2() {
//		System.out.println("Hello World");
//		print3();
//	}
//	
//	public static void print3() {
//		System.out.println("Hello World");
//		print4();
//	}
//	
//	public static void print4() {
//		System.out.println("Hello World");
//		print5();
//	}
//	
//	public static void print5() {
//		System.out.println("Hello World");
//	}
}


