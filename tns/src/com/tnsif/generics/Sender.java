package com.tnsif.generics;
//demo for generic class
public class Sender<T> {
	private T message;

	public T getMessage() {
		return message;
	}

	public void setMessage(T message) {
		this.message = message;
	}
	
}
