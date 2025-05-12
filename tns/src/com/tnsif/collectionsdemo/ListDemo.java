package com.tnsif.collectionsdemo;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
	public static void main(String args[]) {
		List<Integer> ll=new ArrayList<Integer>();
		ll.add(10);
		ll.add(10);
		ll.add(34);
		ll.add(23);
		for(int i:ll) {
			System.out.println(i);
		}
	}
}
