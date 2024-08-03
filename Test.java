package com.dsa;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
//		BinaryTree tree = new BinaryTree();
//		Scanner sc = new Scanner(System.in);
//		tree.populate(sc);
//		tree.display();
		
//		BST bst = new BST();
////		int nums[] = {5,2,7,1,4,6,9,8,3,10};
//		int nums[] = {1,2,3,4,5,6,7};
////		bst.populate(nums);
//		bst.populateSorted(nums);
//		bst.delete(6);
//		bst.inOrder();
		
		AVL tree = new AVL();
		for(int i=0;i<1000;i++) {
			tree.insert(i);
		}
		System.out.println(tree.height());

	}
}




