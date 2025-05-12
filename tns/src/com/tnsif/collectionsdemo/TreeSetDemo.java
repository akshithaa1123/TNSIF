package com.tnsif.collectionsdemo;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		Set<Integer> ll=new TreeSet<Integer>();
		ll.add(10);
		ll.add(10);
		ll.add(34);
		ll.add(23);
		for(int i:ll) {
			System.out.println(i);
	}
	}
}
