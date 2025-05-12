package com.tnsif.collectionsdemo;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
	public static void main(String args[]) {
		List<Integer> ll=new LinkedList<Integer>();
		ll.add(10);
		ll.add(10);
		ll.add(34);
		ll.add(23);
		System.out.println("Before Deletion");
		for(int i:ll) {
			System.out.println(i);
		}
		ll.remove(1);
		System.out.println("After Deletion");
		for(int i:ll) {
			System.out.println(i);
		}
	}
}