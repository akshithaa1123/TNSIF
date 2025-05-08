package com.tnsif.exceptionhandling;

	@SuppressWarnings("serial")
	public class MyException extends Exception {
		public MyException(String mesg) {
			super(mesg);
		}
	}
