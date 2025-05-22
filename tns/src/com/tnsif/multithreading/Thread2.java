package com.tnsif.multithreading;

public class Thread2 {
	ThreadComm tc;
	public Thread2(ThreadComm tc) {
		super();
		this.tc = tc;
	}
	public void run() {
		for(int k=0;k<=5;k++) {
			tc.receive();
		}
	}
}
