package com.tnsif.collectionsdemo;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashDemo {
	public static void main(String[] args) {
		Set<Integer> ll=new LinkedHashSet<Integer>();
		ll.add(10);
		ll.add(10);
		ll.add(34);
		ll.add(23);
		for(int i:ll) {
			System.out.println(i);
	}
	}
}
