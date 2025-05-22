package com.tnsif.generics;

public class SenderMain {

	public static void main(String[] args) {
		
		Sender<String> ob=new Sender<String>();
		ob.setMessage("Hello welcome to Generics");
		System.out.println(ob.getMessage());
		
		Sender<Integer> o=new Sender<Integer>();
		o.setMessage(678);
		System.out.println(o.getMessage());
	}

}
