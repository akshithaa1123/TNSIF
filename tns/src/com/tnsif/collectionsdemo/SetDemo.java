package com.tnsif.collectionsdemo;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		Set<Integer> ll=new HashSet<Integer>();
		ll.add(10);
		ll.add(10);
		ll.add(34);
		ll.add(23);
		for(int i:ll) {
			System.out.println(i);
	}
	}
}
