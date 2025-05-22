package com.tnsif.multithreading;

public class ThreadCommMain {
	public static void main(String[] args) {
		ThreadComm tc=new ThreadComm();
		Thread1 t1=new Thread1(tc);
		Thread2 t2=new Thread2(tc);
		t1.run();
		t2.run();
	}
}
